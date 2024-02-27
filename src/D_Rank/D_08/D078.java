package D_Rank.D_08;

import java.util.Scanner;

public class D078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] test = new int[7];
        for (int i = 0; i < 7; i++){
            test[i] = sc.nextInt();
        }
        int cutLine = sc.nextInt();

        int total = 0;
        for (int i = 0; i <7; i++){
            total += test[i];
        }

        double avg = (double) total / 7;

        if (avg >= cutLine){
            System.out.println("pass");
        } else {
            System.out.println("failure");
        }
    }
}
