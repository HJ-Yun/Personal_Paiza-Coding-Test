package C_Rank.C_04;

import java.util.Scanner;

public class C049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int result = array[0] - 1;
        for (int i = 1; i < n; i++){
            result += Math.abs(array[i] - array[i-1]);
        }
        System.out.print(result);
    }
}
