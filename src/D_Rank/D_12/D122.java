package D_Rank.D_12;

import java.util.Scanner;

public class D122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0){
            System.out.print(0);
        } else {
            int result = 0 - n;
            System.out.print(result);
        }
    }
}
