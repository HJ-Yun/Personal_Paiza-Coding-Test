package D_Rank.D_11;

import java.util.Scanner;

public class D108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int day = 24 / n;
        int remain = 24 % n;

        if (remain == 0){
            System.out.print(day);
        } else if (remain != 0) {
            System.out.print(day + 1);
        }
    }
}
