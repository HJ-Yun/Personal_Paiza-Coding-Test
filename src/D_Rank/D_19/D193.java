package D_Rank.D_19;

import java.util.Scanner;

public class D193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int change = m / n;
        int left = m % n;

        System.out.println(change);
        System.out.print(left);
    }
}
