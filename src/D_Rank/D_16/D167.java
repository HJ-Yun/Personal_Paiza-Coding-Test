package D_Rank.D_16;

import java.util.Scanner;

public class D167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bag = n + 3;

        if (n >= 1000){
            System.out.print(bag);
        } else {
            System.out.print(n);
        }
    }
}
