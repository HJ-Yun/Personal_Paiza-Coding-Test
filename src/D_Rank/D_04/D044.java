package D_Rank.D_04;

import java.util.Scanner;

public class D044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if (s2.equals("M")){
            System.out.printf("Hi, Mr. %s",s1);
        } else if (s2.equals("F")) {
            System.out.printf("Hi, Ms. %s",s1);
        }
    }
}
