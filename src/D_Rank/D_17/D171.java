package D_Rank.D_17;

import java.util.Scanner;

public class D171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int n = sc.nextInt();

        int result1 = p1 - n;
        int result2 = p2 - n;

        System.out.print(result1 + " " + result2);
    }
}
