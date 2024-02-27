package D_Rank.D_07;

import java.util.Scanner;

public class D074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (0 <= n && n <= 47){
            if (n <= 23){
                System.out.print(n);
            } else {
                System.out.println(n - 24);
            }
        }
    }
}
