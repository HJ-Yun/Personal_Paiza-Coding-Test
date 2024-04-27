package C_Rank.C_03;

import java.util.Scanner;

public class C040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        String[] arrayLine = new String[num];
        for (int i = 0; i < num; i++){
                arrayLine[i] = sc.nextLine();
        }

        String[][] array = new String[num][2];
        for (int i = 0; i < num; i++){
            array[i] = arrayLine[i].split(" ");
        }

        double max = 10000;
        double min = 0;

        for (int i = 0; i < num; i++){
            double a = Double.parseDouble(array[i][1]);

            if (array[i][0].equals("le")){
                if (a < max){
                    max = a;
                }
            } else if (array[i][0].equals("ge")) {
                if (a > min){
                    min = a;
                }
            }
        }

        System.out.print(min + " " + max);
    }
}
