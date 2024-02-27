package D_Rank.D_07;

import java.util.Scanner;

public class D070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int result = 0;

        if (1 <= m && m <= 100){
            if (1 <= n && n <= 100){
                result = m - n;
            }
        }
        System.out.println(result);
    }
}
