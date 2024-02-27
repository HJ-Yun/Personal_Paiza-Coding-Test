package D_Rank.D_10;

import java.util.Scanner;

public class D098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        if (200_000 <= a && a <= 1_000_000){
            if (1 <= b && b <= 6){
                result = a * b;
                System.out.print(result);
            }
        }
    }
}
