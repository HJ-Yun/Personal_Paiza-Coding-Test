package D_Rank.D_08;

import java.util.Scanner;

public class D086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        int total = 0;

        if (1 <= l && l <= 100){
            total = l * 5;
        }
        System.out.println(total);
    }
}
