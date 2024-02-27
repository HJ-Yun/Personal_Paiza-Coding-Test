package D_Rank.D_12;

import java.util.Scanner;

public class D117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n; i++){
            result += array[i];
        }

        System.out.print(result);
    }
}
