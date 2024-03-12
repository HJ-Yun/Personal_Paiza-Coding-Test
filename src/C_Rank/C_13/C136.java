package C_Rank.C_13;

import java.util.Arrays;
import java.util.Scanner;

public class C136 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        sc.nextLine();

        int[] record = new int[day];
        for (int i = 0; i < day; i++){
             record[i] = sc.nextInt();
             sc.nextLine();
        }

        int[] moving = new int[day];
        for (int i = 0; i < day-1; i++){
            if (record[i] < record[i+1]){
                moving[i] = 1;
            } else if (record[i] > record[i+1]){
                moving[i] = -1;
            }
        }

        System.out.println(Arrays.toString(moving));

        int[] result = new int[moving.length];
        int check = moving[0];

        for (int i = 0, j = 1; i < moving.length-1; i++, j++){
            if (moving[i] == moving[j]){
                check += moving[j];
            } else if (moving[i] != moving[j]){
                result[i] = check;
                check = moving[j];
            }

            if (i == moving.length-2){
                result[j] = check;
            }
        }

        System.out.println(Arrays.toString(result));

        int max = result[0];
        int min = result[0];

        for (int i = 1; i < result.length; i++){
            if (max < result[i]){
                max = result[i];
            }
        }

        for (int i = 1; i < result.length; i++){
            if (min > result[i]){
                min = result[i];
            }
        }
        System.out.printf("%d %d",Math.abs(min),Math.abs(max));
    }
}
