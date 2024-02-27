package D_Rank.D_27;

import java.util.Scanner;

public class D270 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int w = sc.nextInt();

        int checkA = 15;
        int checkW = 60;

        if (checkA >= a && checkW <= w){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
