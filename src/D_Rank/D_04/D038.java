package D_Rank.D_04;

import java.util.Scanner;

public class D038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (2 <= n && n <= 100){
            int result = n * (n - 1) / 2;
            System.out.print(result);
        }
    }
}
