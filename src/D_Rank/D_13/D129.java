package D_Rank.D_13;

import java.util.Scanner;

public class D129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        double changeRate = (y - x) /100.0;
        double newP = p * (1 + changeRate);
        int result = (int) newP;
        System.out.println(result);
    }
}
