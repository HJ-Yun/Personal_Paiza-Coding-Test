package D_Rank.D_02;

import java.util.Scanner;

public class D019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = Integer.parseInt(sc.next());

        if (n >= 1 && n <= s.length()){
            if (s.length() >= 1 && s.length() <= 10){
                char result = s.charAt(n-1);
                System.out.print(result);
            }
        }
    }
}
