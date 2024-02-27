package D_Rank.D_20;

import java.util.Scanner;

public class D202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int f1 = sc.nextInt();

        int p2 = sc.nextInt();
        int f2 = sc.nextInt();

        int total1 = p1 + f1;
        int total2 = p2 + f2;

        if (total1 >= total2){
            System.out.print(total2);
        } else {
            System.out.print(total1);
        }
    }
}
