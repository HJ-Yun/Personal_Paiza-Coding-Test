package D_Rank.D_14;

import java.util.Arrays;
import java.util.Scanner;

public class D147 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        int[] array = new int[4];
        for (int i = 0; i < 4; i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        int result = s * array[0];
        System.out.print(result);
    }
}
