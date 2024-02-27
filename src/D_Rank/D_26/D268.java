package D_Rank.D_26;

import java.util.Scanner;

public class D268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int give = a + b;
        int left = n - give;

        System.out.print(left);
    }
}
