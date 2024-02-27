package D_Rank.D_09;

import java.util.Scanner;

public class D089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] array = s.split("");

        try {
            for (int i =0; i <s.length(); i++){
                if (0 <= Integer.parseInt(array[i]) && Integer.parseInt(array[i]) <= 9){
                    System.out.print(Integer.parseInt(array[i]));
                } else break;
            }
        } catch (NumberFormatException e) { }
    }
}
