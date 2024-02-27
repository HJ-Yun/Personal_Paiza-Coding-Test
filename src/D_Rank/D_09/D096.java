package D_Rank.D_09;

import java.util.Scanner;

public class D096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (1<= s.length() && s.length() <= 100){
            if (s.contains("I")){
                System.out.print("caution");
            } else if (s.contains("i")) {
                System.out.print("caution");
            } else if (s.contains("l")) {
                System.out.print("caution");
            } else {
                System.out.print(s);
            }
        }
    }
}
