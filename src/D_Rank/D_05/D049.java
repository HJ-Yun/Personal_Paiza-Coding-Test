package D_Rank.D_05;

import java.util.Scanner;

public class D049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (1 <= s.length() && s.length() <= 20){
            if (s.contains("noaki")){
                System.out.print(s.substring(0,s.length()-5));
            } else {
                System.out.print(s);
            }
        }
    }
}
