package D_Rank.D_19;

import java.util.Scanner;

public class D197 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int point = n / 10;

        if (n >= 1000){
            System.out.print(point);
        } else {
            System.out.println(0);
        }
    }
}
