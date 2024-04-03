package C_Rank.C_04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[4];

        for (int i = 0; i < 4; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);

        int max = array[3] * 10 + array[2] * 10 + array[1] + array[0];

        System.out.print(max);
    }
}
