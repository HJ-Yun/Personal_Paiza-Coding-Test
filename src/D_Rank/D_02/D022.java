package D_Rank.D_02;

import java.util.Scanner;

public class D022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());

        if (a >= 1 && a <= 20){
            System.out.print(6 * a * a);
        }
    }
}
