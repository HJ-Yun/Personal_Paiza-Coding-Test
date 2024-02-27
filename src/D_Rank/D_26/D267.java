package D_Rank.D_26;

import java.util.Scanner;

public class D267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();

        int left = n - (m * p);

        System.out.println(left);
    }
}
