package C_Rank.C_10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String buffer = sc.nextLine();

        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        for (int i = 0; i < n-1; i++){
            if (array[i] + 1 == array[i+1]){
                array[i] = 0;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += array[i];
        }
        System.out.print(sum);
    }
}
