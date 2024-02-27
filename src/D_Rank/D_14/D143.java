package D_Rank.D_14;

import java.util.Scanner;

public class D143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int v = sc.nextInt();
        int f = sc.nextInt();

        double upper = m * Math.pow(v,2.0);
        int under = 2 * f;

        int result = (int) upper / under;
        System.out.print(result);
    }
}
