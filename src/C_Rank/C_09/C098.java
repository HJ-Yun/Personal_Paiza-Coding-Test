package C_Rank.C_09;

import java.util.Scanner;

public class C098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int person = sc.nextInt();
        sc.nextLine();

        int[] ballNum = new int[person];
        for (int i = 0; i < person; i++){
            ballNum[i] = sc.nextInt();
            sc.nextLine();
        }

        int count = sc.nextInt();
        sc.nextLine();

        int[][] pass = new int[count][3];
        for (int i = 0; i < count; i++){
            for (int j = 0; j < 3; j++){
                pass[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for (int i = 0; i < count; i++){
                int ball = pass[i][2];
                if (ballNum[pass[i][0]-1] < ball){
                    ballNum[pass[i][0]-1] -= ballNum[pass[i][0]-1];
                    ballNum[pass[i][1]-1] += ball;
                } else {
                    ballNum[pass[i][0]-1] -= ball;
                    ballNum[pass[i][1]-1] += ball;
                }
        }

        for (int i = 0; i < person; i++){
            System.out.print(ballNum[i]);
            if (i != person-1){
                System.out.println();
            }
        }
    }
}
