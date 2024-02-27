package D_Rank.D_06;

import java.util.Scanner;

public class D056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();

        if (1 <= r1 && r1 <= 20){
            if (1 <= r2 && r2 <= 20){
                int a = (int) Math.pow(r1,3.0);
                int b = (int) Math.pow(r2,3.0);
                System.out.print(a - b);
            }
        }
    }
}
