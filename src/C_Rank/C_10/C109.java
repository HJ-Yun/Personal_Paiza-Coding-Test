package C_Rank.C_10;

import java.util.Arrays;
import java.util.Scanner;

public class C109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = sc.nextInt();
        sc.nextLine();

        String[] idList = new String[people];
        for (int i = 0; i < people; i++){
            idList[i] = sc.nextLine();
        }

        String[] idNum = new String[people];
        for (int i = 0; i < people; i++){
            idNum[i] = idList[i].replaceAll("[^0-9]","");
        }

        int[] idInt = new int[people];
        for (int i = 0; i < people; i++){
            idInt[i] = Integer.parseInt(idNum[i]);
        }

        int[] rate = new int[people];
        int total = 1;
        for (int i = 0; i < people; i++){
            for (int j = 0; j < people; j++){
                if (idInt[i] > idInt[j]){
                    total++;
                }
            }
            rate[i] = total;
            total = 1;
        }

        for (int i = 0; i < people; i++){
            for (int j = 0; j < people; j++){
                if (rate[j] == i + 1){
                    System.out.print(idList[j]);
                    if (i < people - 1){
                        System.out.println();
                    }
                }
            }
        }
    }
}
