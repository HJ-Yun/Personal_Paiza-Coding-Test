package D_Rank.D_03;

import java.util.Scanner;

public class D029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 1 && n <=6){
            switch (n){
                case 1:
                    System.out.print("6");
                    break;
                case 2:
                    System.out.print("5");
                    break;
                case 3:
                    System.out.print("4");
                    break;
                case 4:
                    System.out.print("3");
                    break;
                case 5:
                    System.out.print("2");
                    break;
                case 6:
                    System.out.print("1");
                    break;
            }
        }
    }
}
