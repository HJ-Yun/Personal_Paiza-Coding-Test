package D_Rank.D_16;

import java.util.Scanner;

public class D161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[7];
        for (int i = 0; i < 7; i++){
            array[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < 7; i++){
            total += array[i];
        }

        if (total >= n){
            System.out.print(n);
        } else {
            System.out.print(total);
        }
    }
}
