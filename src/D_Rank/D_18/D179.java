package D_Rank.D_18;

import java.util.Scanner;

public class D179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = m % n;

        System.out.print(result);
    }
}
