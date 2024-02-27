package C_Rank.C_10;

import java.util.Arrays;
import java.util.Scanner;

public class C112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] array = new int[n][3];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 3; j++){
                array[i][j] = sc.nextInt();
            }
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++){
            result[i] = array[i][0] + array[i][1] + (24 - array[i][2]);
        }

        Arrays.sort(result);

        System.out.println(result[0]);
        System.out.println(result[2]);
    }
}
