package C_Rank.C_01;

import java.util.Scanner;

public class C014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int boxNum = sc.nextInt();
        int ballRadian = sc.nextInt();
        sc.nextLine();

        int[][] boxSize = new int[boxNum][3];
        for (int i = 0; i < boxNum; i++){
            for (int j = 0; j < 3; j++){
                boxSize[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        int ball = ballRadian * 2;

        for (int i = 0; i < boxNum; i++){
            int judge = 0;
            for (int j = 0; j < 3; j++){
                if (boxSize[i][j] >= ball){
                    judge++;
                }
            }
            if (judge == 3){
                System.out.print(i+1);
                if (i < boxNum-1){
                    System.out.println();
                }
            }
        }
    }
}
