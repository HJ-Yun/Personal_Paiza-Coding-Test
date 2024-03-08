package C_Rank.C_12;

import java.util.Arrays;
import java.util.Scanner;

public class C129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        int num = sc.nextInt();
        sc.nextLine();

        int[] order = new int[num];
        for (int i = 0; i < num; i++){
            order[i] = sc.nextInt();
            sc.nextLine();
        }

        int[] ready = new int[num];
        for (int i = 0; i < num; i++){
            ready[i] = sc.nextInt();
            sc.nextLine();
        }

        int[] orderNum = new int[type];
        int count = 0;
        for (int i = 0; i < type; i++){
            for (int j = 0; j < num; j++){
                if (i + 1 == order[j]){
                    count++;
                }
            }
            orderNum[i] = count;
            count = 0;
        }

        int[] readyNum = new int[type];
        count = 0;
        for (int i = 0; i < type; i++){
            for (int j = 0; j < num; j++){
                if (i + 1 == ready[j]){
                    count++;
                }
            }
            readyNum[i] = count;
            count = 0;
        }

        int result = 0;
        for (int i = 0; i < type; i++){
            if (orderNum[i] == readyNum[i]){
                result++;
            }
        }

        if (result == type){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
