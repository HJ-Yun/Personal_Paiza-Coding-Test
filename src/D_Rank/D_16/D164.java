package D_Rank.D_16;

import java.util.Scanner;

public class D164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;

        for (int i = 1; i <= 8; i++){
            if (n % 2 == 0){
                n = n / 2;
                if (n == 1){
                    System.out.print("OK");
                    break;
                }
            } else {
                System.out.print("NG");
                break;
            }
        }
    }
}
