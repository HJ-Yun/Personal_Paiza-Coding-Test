package D_Rank.D_06;

import java.util.Scanner;

public class D065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (100 <= n && n <= 999){
            if (n / 100 == 2){
                System.out.print("ok");
            } else if (n / 100 == 4) {
                System.out.print("error");
            } else {
                System.out.print("unknown");
            }
        }
    }
}
