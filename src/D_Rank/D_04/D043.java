package D_Rank.D_04;

import java.util.Scanner;

public class D043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (0 <= n && n <= 100){
            if (0 <= n && n <= 30){
                System.out.print("sunny");
            } else if (n <= 70) {
                System.out.print("cloudy");
            } else if (n <= 100){
                System.out.print("rainy");
            }
        }
    }
}
