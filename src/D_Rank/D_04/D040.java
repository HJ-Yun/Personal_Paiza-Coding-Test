package D_Rank.D_04;

import java.util.Scanner;

public class D040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] day = new int[7];
        for (int i = 0; i < 7; i++){
            day[i] = sc.nextInt();
        }

        int result = 0;

        for (int i = 0; i < 7; i++){
            if (0 <= day[i] && day[i] <= 100){
                if (day[i] <= 30){
                   result++;
                }
            }
        }

        System.out.print(result);
    }
}
