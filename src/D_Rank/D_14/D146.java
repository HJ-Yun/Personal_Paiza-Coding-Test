package D_Rank.D_14;

import java.util.Scanner;

public class D146 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.replace("a","");
        s = s.replace("e","");
        s = s.replace("i","");
        s = s.replace("o","");
        s = s.replace("u","");

        System.out.print(s);
    }
}
