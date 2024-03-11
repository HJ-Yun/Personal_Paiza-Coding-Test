package C_Rank.C_12;

import java.util.Scanner;

public class C126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int train = sc.nextInt();
        int hotel = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        int[][] intern = new int[n][2];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 2; j++){
                intern[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        int total = 0;
        total += train;

        for (int i = 0; i < n-1; i++){
            if (train * 2 >= hotel * (intern[i+1][0] - intern[i][1])){
                total += hotel * (intern[i+1][0] - intern[i][1]);
            } else {
                total += train * 2;
            }
        }

        total += train;
        System.out.print(total);
    }
}
