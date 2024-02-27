package D_Rank.D_10;

import java.util.Scanner;

public class D099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] array = s.split("");

        for (int i = 0; i < s.length(); i++){
            System.out.print(array[i]);
            if (i < s.length() - 1){
                System.out.println();
            }
        }
    }
}
