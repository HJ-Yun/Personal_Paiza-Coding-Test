package D_Rank.D_03;

import java.util.Scanner;

public class D025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >= 1 && a <= 100){
            System.out.printf("%03d",a);
        }
    }
}
