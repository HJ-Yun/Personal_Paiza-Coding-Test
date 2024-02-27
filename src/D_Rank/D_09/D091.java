package D_Rank.D_09;

import java.util.Scanner;

public class D091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]array = new int[10];

        for (int i = 0; i < 10; i++){
            array[i] = sc.nextInt();
        }

        int line = 2;
        int result = 0;

        for (int i = 0; i <10; i++){
            if (1<= array[i] && array[i] <= 5){
                if (array[i] <= line){
                    result++;
                }
            }
        }
        System.out.print(result);
    }
}
