package D_Rank.D_09;

import java.util.Scanner;

public class D087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];

        if (1 <= n && n <= 10){
            for (int i  = 0; i < n; i++){
                array[i] = sc.next();
            }

            for (int i = 0; i < n; i++){
                System.out.print(array[i]);
            }
        }
    }
}
