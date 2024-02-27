package D_Rank.D_01;

import java.util.Scanner;

public class D006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();

        if (n >= 1 && n <= 1000){
            if (s.equals("km")){
                System.out.print(n * 1000 * 100 * 10);
            } else if (s.equals("m")) {
                System.out.print(n * 100 * 10);
            } else if (s.equals("cm")) {
                System.out.print(n * 10);
            }
        }
    }
}
