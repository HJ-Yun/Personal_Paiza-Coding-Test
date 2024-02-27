package C_Rank.C_09;

import java.util.Scanner;

public class C097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = 1; i < n + 1; i++){
            if (i % x == 0){
                System.out.print("A");
                if (i % y == 0){
                    System.out.print("B");
                    if (i != n){
                        System.out.println();
                    }
                }
                else if (i != n){
                    System.out.println();
                }
            } else if (i % y == 0) {
                System.out.print("B");
                if (i != n){
                    System.out.println();
                }
            } else {
                System.out.print("N");
                if (i != n){
                    System.out.println();
                }
            }
        }
    }
}
