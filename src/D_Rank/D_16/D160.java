package D_Rank.D_16;

import java.util.Scanner;

public class D160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int measure = n / 10;
        int result = measure * m;

        System.out.print(result);
    }
}
