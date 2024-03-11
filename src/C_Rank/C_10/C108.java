package C_Rank.C_10;

import java.util.Scanner;

public class C108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] sight = new int[n];
        for (int i = 0; i < n; i++){
            sight[i] = sc.nextInt();
            sc.nextLine();
        }

        int[][] moveTime = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                moveTime[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        int move = sc.nextInt();
        int[] plan = new int[move];
        for (int i = 0; i < move; i++){
            plan[i] = sc.nextInt();
            sc.nextLine();
        }

        int total = 0;

        total += sight[plan[0]-1];
        for (int i = 0; i < move-1; i++){
            total += moveTime[plan[i]-1][plan[i+1]-1];
            total += sight[plan[i+1]-1];
        }

        System.out.print(total);
    }
}
