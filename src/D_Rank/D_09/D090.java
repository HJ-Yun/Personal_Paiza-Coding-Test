package D_Rank.D_09;

import java.util.Scanner;

public class D090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        for (int i = 0; i < 5; i++){
            array[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < 5; i++){
            if (0 <= array[i] && array[i] <= 100){
                total += array[i];
            }
        }

        int result = total % 10;
        System.out.print(result);
    }
}
