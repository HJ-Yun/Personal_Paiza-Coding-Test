package C_Rank.C_02;

import java.util.Scanner;

public class C022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        sc.nextLine();

        int[][] stock = new int[day][4];
        for (int i = 0; i < day; i++){
            for (int j = 0; j < 4; j++){
                stock[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        int first = stock[0][0];
        int last = stock[day-1][1];

        int high = stock[0][2];
        for (int i = 0; i < day; i++){
            if (high < stock[i][2]){
                high = stock[i][2];
            }
        }

        int low = stock[0][3];
        for (int i = 0; i < day; i++){
            if (low > stock[i][3]){
                low = stock[i][3];
            }
        }

        System.out.printf("%d %d %d %d",first,last,high,low);
    }
}
