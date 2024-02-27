package D_Rank.D_11;

import java.util.Scanner;

public class D111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String buffer = sc.nextLine();
        String s = sc.nextLine();

        String result = s.substring(0,n);
        System.out.print(result);
    }
}
