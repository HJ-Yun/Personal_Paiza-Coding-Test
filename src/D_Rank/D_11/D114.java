package D_Rank.D_11;

import java.util.Scanner;

public class D114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double rate = 1 + (double) a / 100;

        double result = (double) b * rate;
        System.out.print((int) result);
    }
}
