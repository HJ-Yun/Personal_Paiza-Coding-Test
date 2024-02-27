package D_Rank.D_02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class D016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        if (s.length() >= 1 && s.length() <= 100){
            if (n >= 1 && n <= s.length()){
                System.out.print(s.substring(0,n));
            }
        }
    }
}
