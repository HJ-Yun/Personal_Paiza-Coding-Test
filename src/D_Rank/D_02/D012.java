package D_Rank.D_02;

import java.util.Scanner;

public class D012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        if (n >= -100 && n <= 100){
            System.out.print(Math.abs(n));
        }
    }
}
