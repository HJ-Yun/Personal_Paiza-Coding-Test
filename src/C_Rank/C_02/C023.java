package C_Rank.C_02;

import java.util.Scanner;

public class C023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] correctArray = new int[6];
        for (int i = 0; i < 6; i++){
            correctArray[i] = sc.nextInt();
        }
        sc.nextLine();

        int purchase = sc.nextInt();
        sc.nextLine();

        int[][] purchaseArray = new int[purchase][6];
        for (int i = 0; i < purchase; i++){
            for (int j =0; j < 6; j++){
                purchaseArray[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for (int i = 0; i < purchase; i++){
            int match = 0;
            for (int j = 0; j < 6; j++){
                for (int k = 0; k < 6; k++){
                    if (correctArray[j] == purchaseArray[i][k]){
                        match++;
                    }
                }
            }
            System.out.print(match);
            if (i < purchase-1){
                System.out.println();
            }
        }
    }
}
