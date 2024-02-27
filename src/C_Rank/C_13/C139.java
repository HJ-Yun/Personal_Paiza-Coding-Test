package C_Rank.C_13;

import java.util.*;

public class C139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int[] totalList = new int[total];
        for (int i = 0; i < total; i++){
            totalList[i] = i+1;
        }

        String buffer = sc.nextLine();

        int[] ship = new int[total];
        for (int i = 0; i < total; i++) {
            ship[i] = sc.nextInt();
            String nbuffer = sc.nextLine();
        }

        for (int i = 0; i < total; i++) {
            if (ship[i] > total){
                ship[i] = 0;
            }
            for (int j = i + 1; j < total; j++) {
                if (ship[i] == ship[j]) {
                    ship[j] = 0;
                }
            }
        }

        int miss = 0;
        for (int i = 0; i < total; i++){
            if (ship[i] == 0){
                miss++;
            }
        }
        System.out.println(miss);
    }
}