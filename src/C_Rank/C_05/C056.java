package C_Rank.C_05;

import java.util.Scanner;

public class C056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cutLine = sc.nextInt();
        sc.nextLine();

        int[][] data = new int[num][2];
        for (int i = 0; i < num; i++){
            for (int j = 0; j < 2; j++){
                data[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        int studentNum = 0;
        int[][] result = new int[num][2];
        for (int i = 0; i < num; i++){
            result[i][0] = ++studentNum;
            if ((data[i][0] - data[i][1] * 5) <= 0){
                result[i][1] = 0;
            } else {
                result[i][1] = data[i][0] - data[i][1] * 5;
            }
        }

        for (int i = 0; i < num; i++){
            if (result[i][1] >= cutLine){
                System.out.println(result[i][0]);
            }
        }
    }
}
