package D_Rank.D_06;

import java.util.Scanner;

public class D064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = new String();

        if (1 <= s.length() && s.length() <= 100){
            result = s.replace("False","True");
            System.out.print(result);
        }
    }
}
