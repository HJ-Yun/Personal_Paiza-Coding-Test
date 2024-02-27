package D_Rank.D_03;

import java.util.Scanner;

public class D033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if (s.length() >= 2 && s.length() <= 20){
            if (t.length() >= 2 && t.length() <= 20){
                System.out.print(s.toUpperCase().charAt(0) + "." + t.toUpperCase().charAt(0));
            }
        }
    }
}
