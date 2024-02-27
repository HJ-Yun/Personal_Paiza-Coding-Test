package C_Rank.C_01;

import java.util.Scanner;

public class C115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] array = new int[n-1];
        for (int i = 0; i < n-1; i++){
            array[i] = sc.nextInt();
        }

        int result = 0;
        for (int i = 0; i < n-1; i++) {
            if (array[i] <= m) {
                result += array[i];
            }
        }

        System.out.print(result);
    }
}
