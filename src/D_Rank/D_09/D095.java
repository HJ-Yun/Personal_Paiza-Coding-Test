package D_Rank.D_09;

import java.util.Scanner;

public class D095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (100 <= m && m <= 2000){
            if (100 <= n && n <= 2000){
                if (m <= n){
                    System.out.println(m / n);
                }
            }
        }
    }
}
