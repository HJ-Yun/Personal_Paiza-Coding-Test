package D_Rank.D_09;

import java.util.Scanner;

public class D093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (1000 <= n && n <= 50000){
            if (n % 1111 == 0){
                System.out.print(n);
            } else if (n % 11111 == 0) {
                System.out.print(n);
            } else {
                System.out.print("No");
            }
        }
    }
}
