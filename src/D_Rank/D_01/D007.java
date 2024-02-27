package D_Rank.D_01;

import java.util.Scanner;

public class D007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        if (N >= 1 && N <= 100){
            for (int i = 0; i < N; i++){
                System.out.print("*");
            }
        }
    }
}
