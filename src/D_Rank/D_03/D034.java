package D_Rank.D_03;

import java.util.Scanner;

public class D034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result;

        if (n >= 2 && n <= 21){
            if ((21 % n) == 0){
                System.out.print(n);
            } else {
                System.out.print(21 % n);
            }
        }
    }
}
