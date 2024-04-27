package C_Rank.C_01;

import java.util.Arrays;
import java.util.Scanner;

public class C019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
            sc.nextLine();
        }


        for (int i = 0; i < n; i++){
            int checkNum = 0;

            for (int j = 1; j < array[i]; j++){
                if (array[i] % j == 0){
                     checkNum += j;
                }
            }

            if (checkNum == array[i]){
                System.out.println("perfect");
            } else if (array[i] - 1 <= checkNum && checkNum <= array[i] + 1) {
                System.out.println("nearly");
            } else {
                System.out.println("neither");
            }
        }
    }
}
