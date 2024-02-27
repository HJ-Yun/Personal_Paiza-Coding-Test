package D_Rank.D_15;

import java.util.Scanner;

public class D148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = 0;

        if (a >= c){
            result = a + b;
        } else {
            result = a;
        }

        System.out.print(result);
    }
}
