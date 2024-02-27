package D_Rank.D_06;

import java.util.Scanner;

public class D055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if (1 <= s1.length() && s1.length() <= 20){
            if (1 <= s2.length() && s2.length() <= 20){
                System.out.printf("Best in %s %s",s1,s2);
            }
        }
    }
}
