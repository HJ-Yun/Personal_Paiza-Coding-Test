package D_Rank.D_02;

import java.util.Scanner;

public class D015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        if (n >= 1 && n <= 100){
            for (int i = 0; i < n; i++){
                System.out.print(n-i);
                if ((n-i) != 1){
                    System.out.println();
                }
            }
        }
    }
}
