package C_Rank.C_01;

import java.util.Scanner;

public class C017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] parent = new int[2];
        for (int i = 0; i < 2; i++){
            parent[i] = sc.nextInt();
        }
        sc.nextLine();

        int n = sc.nextInt();
        sc.nextLine();

        int[][] child = new int[n][2];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 2; j++){
                child[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for (int i = 0; i < n; i++){
            if (parent[0] > child[i][0]){
                System.out.print("High");
            } else if (parent[0] < child[i][0]) {
                System.out.print("Low");
            } else if (parent[0] == child[i][0]){
                if (parent[1] > child[i][1]){
                    System.out.print("Low");
                } else if (parent[1] < child[i][1]){
                    System.out.print("High");
                }
            }
            if (i != n-1){
                System.out.println();
            }
        }
    }
}
