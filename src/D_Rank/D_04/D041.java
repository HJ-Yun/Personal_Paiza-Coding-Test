package D_Rank.D_04;

import java.util.Scanner;

public class D041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        if (1 <= n && n <= 500){
            if (1 <= d && d <= 10){
                if (1 <= e && e <= 500){
                    if (n <= d * e){
                        System.out.print("OK");
                    } else {
                        System.out.print("NG");
                    }
                }
            }
        }
    }
}
