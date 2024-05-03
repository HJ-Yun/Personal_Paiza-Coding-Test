package C_Rank.C_02;

import java.util.Scanner;

public class C030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine();

        int[][] array = new int[h][w];

        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                array[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++){
                if (array[i][j] >= 128){
                    array[i][j] = 1;
                    System.out.print(array[i][j]);
                    if (j <w-1){
                        System.out.print(" ");
                    }
                } else {
                    array[i][j] = 0;
                    System.out.print(array[i][j]);
                    if (j <w-1){
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
