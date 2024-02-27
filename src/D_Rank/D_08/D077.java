package D_Rank.D_08;

import java.util.Scanner;

public class D077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (1 <= a && a <= 9999){
            if (1 <= b && b<= 9999){
                if (a * b <= 9999){
                    System.out.print(a * b);
                } else {
                    System.out.print("NG");
                }
            }
        }
    }
}
