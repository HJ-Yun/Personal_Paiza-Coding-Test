package D_Rank.D_07;

import java.util.Scanner;

public class D072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = sc.nextInt();

        if (1 <= x && x <= 1000){
            if (1 <= y && y <= 1000){
                if (1 <= p && p <=10000){
                    int result = x / y;
                    if ((x % y) == 0){
                        System.out.print(result * p);
                    } else {
                        System.out.print((result + 1) * p);
                    }
                }
            }
        }
    }
}
