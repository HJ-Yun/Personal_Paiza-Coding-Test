package C_Rank.C_01;

import java.util.Scanner;

public class C099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int[] array = new int[n-1];
        for (int i = 0; i < n-1; i++){
            array[i] = sc.nextInt();
        }

        int total = d * d * n;

        int cover = 0;
        for (int i = 0; i < n-1; i++){
            cover += d * array[i];
        }

        int result = total - cover;
        System.out.print(result);
    }
}
