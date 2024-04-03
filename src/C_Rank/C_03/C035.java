package C_Rank.C_03;

import java.util.Scanner;

public class C035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String[][] array = new String[num][6];

        for (int i = 0; i < num; i++){
            for (int j = 0; j < 6; j++){
                array[i][j] = sc.next();
            }
            sc.nextLine();
        }

        int pass = 0;

        for (int i = 0; i < num; i++){
            int total = 0;
            int cutLine = 0;

            for (int j = 1; j < 6; j++){
                if (array[i][0].equals("s")){
                    total += Integer.parseInt(array[i][j]);
                    cutLine = Integer.parseInt(array[i][2]) + Integer.parseInt(array[i][3]);
                } else if (array[i][0].equals("l")) {
                    total += Integer.parseInt(array[i][j]);
                    cutLine = Integer.parseInt(array[i][4]) + Integer.parseInt(array[i][5]);
                }
            }
            if (total >= 350 && cutLine >= 160){
                pass++;
            }
        }
        System.out.print(pass);
    }
}
