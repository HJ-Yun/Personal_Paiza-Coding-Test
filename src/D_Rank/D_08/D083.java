package D_Rank.D_08;

import java.util.Scanner;

public class D083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (1 <= n && n <= 13){
            if (1 <= m && m <= 13){
                if (n + m < 16){
                    System.out.print("HIT");
                } else {
                    System.out.print("STAND");
                }
            }
        }
    }
}
