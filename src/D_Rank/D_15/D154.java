package D_Rank.D_15;

import java.util.Scanner;

public class D154 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int total = n * n;
        int possible = total - m;

        System.out.print(possible);
    }
}
