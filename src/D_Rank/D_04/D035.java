package D_Rank.D_04;

import java.util.Scanner;

public class D035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (2000 <= y && y <= 2016){
            if (1 <= m && m <= 12){
                if (1 <= d && d <= 31){
                    System.out.printf("%d/%d/%d",y,m,d);
                    System.out.println();
                    System.out.print(y + "/" + m  + "/" + d);
                }
            }
        }
    }
}
