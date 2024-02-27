package D_Rank.D_08;

import java.util.Scanner;

public class D081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();

        if (2 <= n && n <= 10){
            if (1 <= h && h <= 50){
                if (1 <= w && w <= 50){
                    int total = h * w;
                    System.out.print(total % n);
                }
            }
        }
    }
}
