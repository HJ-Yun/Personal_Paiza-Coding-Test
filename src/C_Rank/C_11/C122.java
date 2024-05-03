package C_Rank.C_11;

import java.util.Arrays;
import java.util.Scanner;

public class C122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();

        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
            sc.nextLine();
        }

        Arrays.sort(array);

        int total = 0;
        if (n < x){
            for (int i = 0; i < n; i++){
                total += array[i];
            }
        } else {
            for (int i = y; i < n; i++){
                total += array[i];
            }
        }
        System.out.print(total);
    }
}
