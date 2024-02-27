package D_Rank.D_05;

import java.util.Arrays;
import java.util.Scanner;

public class D046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] egg = new int[3];
        for (int i = 0; i < 3; i++){
            egg[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++){
            if (1 <= egg[i] && egg[i] <= 100){
                Arrays.sort(egg);
            }
        }
        System.out.print(egg[2]);
    }
}
