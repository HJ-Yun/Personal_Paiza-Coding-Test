package C_Rank.C_08;

import java.util.Scanner;

public class C084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i = 0; i < s.length() + 2; i++){
            System.out.print("+");
        }
        System.out.println();
        System.out.printf("+%s+",s);
        System.out.println();
        for (int i = 0; i < s.length() + 2; i++){
            System.out.print("+");
        }
    }
}
