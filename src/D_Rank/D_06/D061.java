package D_Rank.D_06;

import java.util.Scanner;

public class D061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        if (0 <= c && c <= 100){
            if (c == 0){
                System.out.print(1);
            } else {
                System.out.print(c * 3);
            }
        }
    }
}
