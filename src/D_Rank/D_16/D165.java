package D_Rank.D_16;

import java.util.Scanner;

public class D165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;

        for (int i = 0; i < 4; i++){
            if (array[0].equals(array[i])){
                result1++;
            }
            if (array[1].equals(array[i])){
                result2++;
            }
            if (array[2].equals(array[i])){
                result3++;
            }
        }

        if (result1 >= 2){
            System.out.print("NG");
        } else if (result2 >= 2) {
            System.out.print("NG");
        } else if (result3 >= 2) {
            System.out.print("NG");
        } else {
            System.out.print("OK");
        }
    }
}
