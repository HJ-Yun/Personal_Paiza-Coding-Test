package D_Rank.D_03;

import java.util.Scanner;

public class D032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0 && n <= 100){
            System.out.print(100 - n);
        }
    }
}
