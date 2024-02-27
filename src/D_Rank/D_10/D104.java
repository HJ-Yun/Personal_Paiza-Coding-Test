package D_Rank.D_10;

import java.util.Scanner;

public class D104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 10){
            System.out.print(1000);
        } else {
            int result = n * 150;
            System.out.print(result);
        }
    }
}
