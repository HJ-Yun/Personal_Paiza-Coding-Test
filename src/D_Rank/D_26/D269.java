package D_Rank.D_26;

import java.util.Scanner;

public class D269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");

        for (int i = 0; i <s.length(); i += 2){
            System.out.print(array[i]);
        }
    }
}
