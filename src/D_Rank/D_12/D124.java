package D_Rank.D_12;

import java.util.Scanner;

public class D124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = n / 24;
        if (n % 24 == 0){
            System.out.print(result);
        } else {
            System.out.print(result + 1);
        }
    }
}
