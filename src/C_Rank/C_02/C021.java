package C_Rank.C_02;

import java.util.Scanner;

public class C021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int xc = sc.nextInt();
        int yc = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        sc.nextLine();

        int n = sc.nextInt();
        sc.nextLine();

        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < n; i++){
            int r1Pow = (int) Math.pow(r1,2);
            int r2Pow = (int) Math.pow(r2,2);

            int xCalc = (int) Math.pow((x[i]-xc),2);
            int yCalc = (int) Math.pow((y[i]-yc),2);
            int totalCalc = xCalc + yCalc;

            if (r1Pow <= totalCalc && totalCalc <= r2Pow){
                System.out.print("yes");
            } else {
                System.out.print("no");
            }
            if (i < n-1){
                System.out.println();
            }
        }
    }
}
