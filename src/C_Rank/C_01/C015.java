package C_Rank.C_01;

import java.util.Scanner;

public class C015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        sc.nextLine();

        int[][] paper = new int[day][2];
        for (int i = 0; i < day; i++){
            for (int j = 0; j < 2; j++){
                paper[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        int point = 0;
        for (int i = 0; i < day; i++){
            if (paper[i][0] / 10 == 3 || paper[i][0] % 10 == 3){
                point += (int) (paper[i][1] * 0.03);
            } else if (paper[i][0] % 10 == 5) {
                point += (int) (paper[i][1] * 0.05);
            } else {
                point += (int) (paper[i][1] * 0.01);
            }
        }
        System.out.print(point);
    }
}
