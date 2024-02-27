package D_Rank.D_02;

import java.util.Scanner;

public class D013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());

        if (m >= 1 && m <= 100){
            if (n >= 1 && n <=100){
                System.out.print((m / n) + " " + (m % n));
            }
        }
    }
}
