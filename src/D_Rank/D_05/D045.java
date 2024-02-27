package D_Rank.D_05;

import java.util.Scanner;

public class D045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (1 <= n && n <= 5){
            switch (n){
                case 5:
                    System.out.print("A");
                    break;
                case 4:
                    System.out.print("B");
                    break;
                case 3:
                    System.out.print("C");
                    break;
                case 2:
                    System.out.print("D");
                    break;
                case 1:
                    System.out.print("E");
                    break;
            }
        }
    }
}
