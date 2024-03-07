package C_Rank.C_08;

import java.util.Scanner;

public class C089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int width = sc.nextInt();
        sc.nextLine();

        String[] heightArray = new String[height];
        for (int i = 0; i < height; i++) {
            heightArray[i] = sc.nextLine();
        }

        int[][] score = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                score[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        String[][] board = new String[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                board[i][j] = String.valueOf(heightArray[i].charAt(j));
            }
        }

        int totalScore = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (board[i][j].equals("o"))
                    totalScore += score[i][j];
            }
        }
        System.out.println(totalScore);
    }
}
