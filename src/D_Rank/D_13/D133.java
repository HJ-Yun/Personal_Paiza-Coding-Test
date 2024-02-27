package D_Rank.D_13;

import java.util.Scanner;

public class D133 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int stock = x / a;
        int earn = b - a;
        int result = stock * earn;

        System.out.print(result);
    }
}
