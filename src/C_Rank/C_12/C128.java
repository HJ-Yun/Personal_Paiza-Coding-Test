package C_Rank.C_12;

import java.util.Scanner;

public class C128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
            sc.nextLine();
        }

        int b = array[n-2]; int d = 1; int upN = 0;
        int a = 1; int c = array[n-1]; int downN = 0;

        for (int i = n-2; i > -1; i--){
            if (i != 0){
                upN = b*c + a*d;
                downN = a*c;

                d = downN;
                c = upN;

                b = array[i-1];;
                a = 1;
            } else {
                upN = b*c + a*d;
                downN = c;
            }
        }
        System.out.printf("%d %d", upN, downN);
    }
}
