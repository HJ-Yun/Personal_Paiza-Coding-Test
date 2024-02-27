package D_Rank.D_10;

import java.util.Scanner;

public class D101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % 2 == 0 && b % 2 == 0){
            System.out.print("NO");
        } else if (a % 2 == 1 && b % 2 == 1) {
            System.out.print("NO");
        } else {
            System.out.print("YES");
        }
    }
}
