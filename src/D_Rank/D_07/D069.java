package D_Rank.D_07;

import java.util.Scanner;

public class D069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[7];
        for (int i = 0; i < 7; i++){
            array[i] = sc.nextInt();
            if (0 <= array[i] && array[i] <= 100){ }
            else break;
        }

        double result = 0;

        for (int i = 0; i < 7; i++){
            result = result + array[i] * 100;
        }
        System.out.printf("%.1f",result / 700);
    }
}
