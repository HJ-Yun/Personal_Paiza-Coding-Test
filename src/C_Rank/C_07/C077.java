package C_Rank.C_07;

import java.util.Scanner;

public class C077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentNum = sc.nextInt();
        int examNum = sc.nextInt();
        sc.nextLine();

        int[][] data = new int[studentNum][2];

        for (int i = 0; i < studentNum; i++){
            for (int j = 0; j < 2; j++){
                data[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        int[] afterData = new int[studentNum];
        int examPoint = 100 / examNum;
        for (int i = 0; i < studentNum; i++){
            if (data[i][0] <= 0){
                afterData[i] = examPoint * data[i][1];
            } else if (data[i][0] <= 9) {
                afterData[i] = examPoint * data[i][1] * 8 / 10;
            } else if (data[i][0] >= 10){
                afterData[i] = 0;
            }
        }

        for (int i = 0; i < studentNum; i++){
            if (80 <= afterData[i] && afterData[i] <= 100){
                System.out.println("A");
            } else if (70 <= afterData[i]) {
                System.out.println("B");
            } else if (60 <= afterData[i]) {
                System.out.println("C");
            } else if (0 <= afterData[i]) {
                System.out.println("D");
            }
        }
    }
}
