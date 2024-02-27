package D_Rank.D_05;

import java.util.Scanner;

public class D050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        if (1 <= d1 && d1 <= 1000){
            if (1 <= d2 && d2 <= 1000){
                if (d1 > 5 && d2 >5){
                    System.out.print(10);
                } else if (d1 > 5 || d2 > 5) {
                    System.out.print(Integer.min(d1,d2) + 5);
                } else {
                    System.out.print(d1 + d2);
                }
            }
        }
    }
}
