package D_Rank.D_03;

import java.util.Scanner;

public class D031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 1 && n <= 100){
            System.out.print(n * 60);
        }
    }
}
