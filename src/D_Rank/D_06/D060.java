package D_Rank.D_06;

import java.util.Scanner;

public class D060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        if (0 <= a && a <= 100){
            if (0 <= b && b <= 100){
                result = a - b;
            }
            System.out.print(a - b);
        }
    }
}
