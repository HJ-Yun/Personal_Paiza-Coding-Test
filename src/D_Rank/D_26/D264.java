package D_Rank.D_26;

import java.util.Scanner;

public class D264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        if (p >= 1000){
            int discount = p - 100;
            System.out.print(discount);
        } else {
            System.out.print(p);
        }
    }
}
