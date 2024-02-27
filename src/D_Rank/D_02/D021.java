package D_Rank.D_02;

import java.util.Scanner;

public class D021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        if (s.length() >= 1 && s.length() <= 10){
            if (t.length() >= 1 && t.length() <= 10){
                if (s.equals(t)){
                    System.out.print("Yes");
                } else {
                    System.out.print("No");
                }
            }
        }
    }
}
