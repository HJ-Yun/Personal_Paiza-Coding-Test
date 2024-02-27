package D_Rank.D_01;

import java.util.Scanner;

public class D009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        if (a >= 1 && a <= 2014){
            if (b >= 1 && b <=2014){
                if (a < b){
                    System.out.print(b - a);
                }
            }
        }
    }
}
