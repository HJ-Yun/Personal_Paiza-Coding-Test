package D_Rank.D_15;

import java.util.Scanner;

public class D151 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();

        if (s.equals("chocolate")){
            System.out.print(n * 2);
        } else if (s.equals("cake")) {
            System.out.print(n * 5);
        }
    }
}
