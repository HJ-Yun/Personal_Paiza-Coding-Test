package D_Rank.D_03;

import java.util.Scanner;

public class D026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d1 = sc.nextLine();
        String d2 = sc.nextLine();
        String d3 = sc.nextLine();
        String d4 = sc.nextLine();
        String d5 = sc.nextLine();
        String d6 = sc.nextLine();
        String d7 = sc.nextLine();

        String[] array = new String[7];
        array[0] = d1;
        array[1] = d2;
        array[2] = d3;
        array[3] = d4;
        array[4] = d5;
        array[5] = d6;
        array[6] = d7;

        int result = 0;

        for (int i = 0; i < 7; i++){
            if (array[i].equals("no")){
                result++;
            }
        }
        System.out.print(result);
    }
}
