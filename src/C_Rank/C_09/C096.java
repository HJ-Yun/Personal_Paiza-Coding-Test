package C_Rank.C_09;

import java.util.Scanner;

public class C096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] array = new int[n][2];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < 2; j++){
                array[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        int[][] month = new int[n][31];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < array[i][1] - array[i][0] + 1; j++){
                month[i][array[i][0] - 1 + j] = 1;
            }
        }

        int count = 0;
        for (int i = 0; i < 31; i++){
            int sum = 0;
            for (int j = 0; j < n; j++){
                if (month[j][i] == 1){
                    sum++;
                }
            }

            if (sum == n){
                System.out.println("OK");
                break;
            } else {
                count++;
            }
        }
        if (count == 31){
            System.out.println("NG");
        }
    }
}
