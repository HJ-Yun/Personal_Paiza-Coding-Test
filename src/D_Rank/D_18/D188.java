package D_Rank.D_18;

import java.util.Scanner;

public class D188 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = a + b;

        if (result == 21){
            System.out.println("Win");
        } else {
            System.out.println(result);
        }
    }
}
