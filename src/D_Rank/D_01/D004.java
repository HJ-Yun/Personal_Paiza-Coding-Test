package D_Rank.D_01;

import java.util.Arrays;
import java.util.Scanner;

public class D004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        String[] array = new String[n];
        if (n >= 1 && n <= 20) {
            for (int i = 0; i < n; i++) {
                array[i] = sc.next();
            }
            System.out.print("Hello ");
            for (int j = 0; j < n; j++){
                System.out.print(array[j]);
                if (j < n-1){
                    System.out.print(",");
                }
            }
            System.out.print(".");
        }
    }
}