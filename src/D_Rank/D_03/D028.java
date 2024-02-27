package D_Rank.D_03;

import java.util.Scanner;

public class D028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 1 && n <= 10000){
            String result = n + "";
            System.out.print(result.length());
        }
    }
}
