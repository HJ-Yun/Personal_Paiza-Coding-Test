package C_Rank.C_01;

import java.util.Scanner;

public class C010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int r = sc.nextInt();
        sc.nextLine();

        int n = sc.nextInt();
        sc.nextLine();

        int[][] place = new int[n][2];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 2; j++){
                place[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for (int i = 0; i < n; i++){
            if (Math.pow(place[i][0]-a,2) + Math.pow(place[i][1]-b,2) >= Math.pow(r,2)){
                System.out.println("silent");
            } else {
                System.out.println("noisy");
            }
        }
    }
}
