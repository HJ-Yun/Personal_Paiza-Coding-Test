package D_Rank.D_07;

import java.util.Scanner;

public class D066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (1 <= m && m <= 20){
            if (1<= n && n <= 20){
                if (m < n){
                    System.out.println(n - m);
                } else if (m == n) {
                    System.out.println(0);
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
