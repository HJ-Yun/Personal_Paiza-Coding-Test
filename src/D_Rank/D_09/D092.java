package D_Rank.D_09;

import java.util.Scanner;

public class D092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xA = sc.nextInt();
        int yA = sc.nextInt();
        int pA = sc.nextInt();

        int xB = sc.nextInt();
        int yB = sc.nextInt();
        int pB = sc.nextInt();

        double resultA = (double) pA / (xA * yA);
        double resultB = (double) pB / (xB * yB);

        if (resultA > resultB){
            System.out.printf("%d %d %d",xA,yA,pA);
        } else if (resultA < resultB) {
            System.out.printf("%d %d %d",xB,yB,pB);
        } else {
            System.out.print("DRAW");
        }
    }
}
