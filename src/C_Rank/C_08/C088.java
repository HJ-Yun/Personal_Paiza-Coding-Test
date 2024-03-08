package C_Rank.C_08;

import java.util.Scanner;

public class C088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        sc.nextLine();

        int[] price = new int[type];
        for (int i = 0; i < type; i++){
            price[i] = sc.nextInt();
        }
        sc.nextLine();

        int haveGold = sc.nextInt();
        int orderNum = sc.nextInt();
        sc.nextLine();

        int[][] order = new int[orderNum][2];
        for (int i = 0; i < orderNum; i++){
            for (int j = 0; j < 2; j++){
                order[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for (int i = 0; i < orderNum; i++){
            if (haveGold >= price[order[i][0]-1] * order[i][1]){
                haveGold -= price[order[i][0]-1] * order[i][1];
            }
        }

        System.out.print(haveGold);
    }
}
