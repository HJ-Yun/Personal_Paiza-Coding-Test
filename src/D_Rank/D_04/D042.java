package D_Rank.D_04;

import java.util.Scanner;

public class D042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[2][2];

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int result = 0;

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                if (-1000 <= matrix[i][j] && matrix[i][j] <= 1000){
                    result = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
                }
            }
        }
        System.out.print(result);
    }
}
