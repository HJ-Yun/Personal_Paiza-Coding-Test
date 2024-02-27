package D_Rank.D_17;

import java.util.Scanner;

public class D175 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.equals("A")){
            System.out.print(10);
        } else if (s.equals("B")) {
            System.out.print(11);
        } else {
            System.out.print(Integer.parseInt(s));
        }
    }
}
