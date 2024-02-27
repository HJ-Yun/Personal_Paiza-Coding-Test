package D_Rank.D_01;

import java.util.Scanner;

public class D008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        if (N % 2 == 0){
            System.out.print("even");
        } else {
            System.out.print("odd");
        }
    }
}
