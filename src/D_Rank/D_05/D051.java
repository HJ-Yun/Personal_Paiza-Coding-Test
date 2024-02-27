package D_Rank.D_05;

import java.util.Scanner;

public class D051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cloth = new String[10];

        int result = 0;

        for (int i = 0; i < 10; i++){
            cloth[i] = sc.next();
            if (cloth[i].equals("W")){
                result++;
            }
        }

        if (result >= 5){
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}
