package D_Rank.D_14;

import java.util.Scanner;

public class D141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String buffer = sc.nextLine();

        String[] array = new String[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++){
            System.out.print(array[i]);
            if (i < n - 1){
                System.out.print(" ");
            }
        }
    }
}
