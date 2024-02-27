package D_Rank.D_12;

import java.util.Scanner;

public class D119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double pi = 3.141592653589793;

        double pow = Math.pow(10,n);

        double beforePi = pi * pow;
        long afterPi = (long) beforePi;
        double result = (double) afterPi / pow;
        System.out.print(result);
    }
}
