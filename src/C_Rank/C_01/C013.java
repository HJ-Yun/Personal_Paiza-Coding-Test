package C_Rank.C_01;

import java.util.Arrays;
import java.util.Scanner;

public class C013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dislikeNum = sc.nextInt();
        sc.nextLine();

        int n = sc.nextInt();
        sc.nextLine();

        int[] roomNum = new int[n];

        for (int i = 0; i < n; i++){
            roomNum[i] = sc.nextInt();
            sc.nextLine();
        }

        int[][] num = new int[n][4];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 4; j++){
                num[i][0] = roomNum[i] / 1000;
                num[i][1] = (roomNum[i] % 1000) / 100;
                num[i][2] = ((roomNum[i] % 1000) % 100) / 10;
                num[i][3] = ((roomNum[i] % 1000) % 100) % 10;
            }
        }

        int check = 0;
        int judge = 0;
        for (int i = 0; i< n; i++){
            for (int j = 0; j < 4; j++){
                if (num[i][j] != dislikeNum){
                    check++;
                }
            }
            if (check == 4){
                System.out.println(roomNum[i]);
                judge++;
            }
            check = 0;
        }

        if (judge == 0){
            System.out.println("none");
        }
    }
}
