package D_Rank.D_13;

import java.util.Scanner;

public class D134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.length() > 10){
            System.out.println(s.substring(0,11));
            System.out.println(s.substring(11));
        } else {
            System.out.print(s);
        }
    }
}
