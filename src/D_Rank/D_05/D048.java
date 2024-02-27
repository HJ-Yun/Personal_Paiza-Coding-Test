package D_Rank.D_05;

import java.util.Scanner;

public class D048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] wind = new int[5];
        for (int i = 0; i < 5; i++) {
            wind[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (1 <= wind[i] && wind[i] <= 31) {
                for (i = 0; i < 4; i++) {
                    System.out.print(wind[i + 1] - wind[i]);
                    if (i != 3) {
                        System.out.println();
                    }
                }
            }
        }
    }
}
