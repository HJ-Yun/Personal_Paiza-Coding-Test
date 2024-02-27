package D_Rank.D_14;

import java.util.Scanner;

public class D142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (n % x == 0){
            System.out.println(n / x * y);
        } else {
            System.out.println((n / x + 1) * y);
        }
    }
}
