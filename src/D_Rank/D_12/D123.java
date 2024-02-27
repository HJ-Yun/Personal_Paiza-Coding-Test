package D_Rank.D_12;

import java.util.Scanner;

public class D123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result;

        if (x < 10_000){
            result = x + 10_000;
            System.out.print(result);
        } else {
            System.out.print(x);
        }
    }
}
