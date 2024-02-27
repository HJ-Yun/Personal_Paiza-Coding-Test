package D_Rank.D_07;

import java.util.Arrays;
import java.util.Scanner;

public class D075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];

        for (int i = 0; i < 4; i++) {
            array[i] = sc.nextInt();
        }

        int[] copyArray = Arrays.copyOf(array, 5);
        Arrays.sort(copyArray);

        for (int i= 1; i <5; i++){
            if (copyArray[4] != 5) {
                System.out.println(5);
                break;
            } else if (copyArray[i] != i) {
                System.out.println(i);
                break;
            }
        }
    }
}
