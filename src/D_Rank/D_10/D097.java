package D_Rank.D_10;

import java.util.Scanner;

public class D097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[7];
        for (int i = 0; i < 7; i++){
            array[i] = sc.nextInt();
        }

        int result = 0;

        for (int i = 0; i < 7; i++){
            if (array[i] == 1){
                result++;
            }
        }

        if (result > 5){
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
