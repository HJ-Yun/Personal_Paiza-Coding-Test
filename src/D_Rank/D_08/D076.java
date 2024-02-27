package D_Rank.D_08;

import java.util.Scanner;

public class D076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String s = sc.nextLine();

        if (1 <= w.length() && w.length() <= 100){
            if (1 <= s.length() && s.length() <= 100){
                if (s.contains(w)){
                    System.out.print("NG");
                } else {
                    System.out.print(s);
                }
            }
        }
    }
}
