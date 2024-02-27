package D_Rank.D_08;

import java.util.Scanner;

public class D080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int total = 0;

        if (1 <= n && n <= 100){
            if (1 <= m && m <= 100){
                total = n * 6000 + m * 4000;
            }
        }
        System.out.print(total);
    }
}
