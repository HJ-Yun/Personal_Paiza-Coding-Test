package C_Rank.C_07;

import java.util.Scanner;

public class C078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int buy = sc.nextInt();
        int sell = sc.nextInt();
        sc.nextLine();

        int[] price = new int[day];
        for (int i = 0; i < day; i++){
            price[i] = sc.nextInt();
            sc.nextLine();
        }

        int total = 0;
        int wallet = 0;

        for (int i = 0; i < day; i++) {
            if (price[i] >= sell || i == day - 1) {
                wallet += price[i] * total;
                total = 0;
            } else if (price[i] <= buy) {
                wallet -= price[i];
                total++;
            }
        }
        System.out.print(wallet);
    }
}
