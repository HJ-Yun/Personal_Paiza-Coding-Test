package D_Rank.D_01;

import java.util.Scanner;

public class D003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = Integer.parseInt(sc.next());

        for (int i = 1; i < 10; i++){
            System.out.print(s1 * i);
            if (i < 9){
                System.out.print(" ");
            }
        }
    }
}
