package C_Rank.C_01;

import java.util.Scanner;

public class C130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[][] array = new String[n][2];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 2; j++){
                array[i][j] = sc.next();
            }
        }

        int total = 0;
        for (int i = 0; i < n; i++){
            if (array[i][0].equals("y") && array[i][1].equals("y")){
                //empty
            } else {
                total++;
            }
        }
        System.out.println(total);

        for (int i = 0; i < n; i++){
            if (array[i][0].equals("y") && array[i][1].equals("y")){
                //empty
            } else {
                System.out.println(i+1);
            }
        }
    }
}
