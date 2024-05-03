package C_Rank.C_08;

import java.util.Scanner;

public class C083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.nextLine();

        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < n; i++){
            if (max < array[i]){
                max = array[i];
            }
        }

        int total = max / r;
        for (int i = 0; i < n; i++){
            int star = array[i] / r;
            System.out.print(i+1 + ":");
            for (int j = 0; j < star; j++){
                System.out.print("*");
            }
            for (int k = 0; k < total - star; k++){
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
