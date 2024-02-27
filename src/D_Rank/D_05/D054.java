package D_Rank.D_05;

import java.util.Scanner;

public class D054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (1 <= s.length() && s.length() <= 20){
            if (s.length() >= 11){
                System.out.print("OK");
            } else {
                System.out.print(11-s.length());
            }
        }
    }
}
