package C_Rank.C_07;

import java.util.Scanner;

public class C075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int remain = sc.nextInt();
        int num = sc.nextInt();
        sc.nextLine();
        int point = 0;

        int[] rate = new int[num];
        for (int i = 0; i < num; i++){
            rate[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < num; i++){
            if (point >= rate[i]){
                point -= rate[i];
            } else {
                remain -= rate[i];
                point += rate[i] * 0.1;
            }

            System.out.printf("%d %d",remain,point);
            if (i < num-1){
                System.out.println();
            }
        }
    }
}
