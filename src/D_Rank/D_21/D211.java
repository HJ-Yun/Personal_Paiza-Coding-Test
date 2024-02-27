package D_Rank.D_21;

import java.util.Scanner;

public class D211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = n % m;

        System.out.print(result);
    }
}
