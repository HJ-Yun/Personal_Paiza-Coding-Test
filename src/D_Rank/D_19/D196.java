package D_Rank.D_19;

import java.util.Scanner;

public class D196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < n; i++){
            total += array[i];
        }

        System.out.print(total);
    }
}
