package D_Rank.D_04;

import java.util.Scanner;

public class D037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (1 <= m && m<= 100){
            if (1 <= n && n <= 100){
                if ((n % m) == 0){
                    System.out.print(n / m);
                } else {
                    System.out.print((n / m) + 1);
                }
            }
        }
    }
}
