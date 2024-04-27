package C_Rank.C_04;

import java.util.Scanner;

public class C048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int percent = sc.nextInt();

        int total = 0;
        while (price > 0){
            total += price;
            price = price * (100 - percent) / 100;
        }

        System.out.println(total);
    }
}
