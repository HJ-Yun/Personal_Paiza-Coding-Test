package D_Rank.D_03;

import java.util.Scanner;

public class D024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= 1 && a <= 179){
            if (b >= 1 && b <= 179){
                if ((a+b) >= 2 && (a+b) <= 179){
                    System.out.print(180-a-b);
                }
            }
        }
    }
}
