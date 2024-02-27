package D_Rank.D_15;

import java.util.Scanner;

public class D155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (n >= m){
            System.out.print(n * a);
        } else {
            System.out.print(n * b);
        }
    }
}
