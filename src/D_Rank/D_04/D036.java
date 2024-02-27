package D_Rank.D_04;

import java.util.Scanner;

public class D036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = s.replace("at","@");


        if (1<= s.length() && s.length() <= 100){
            System.out.print(result);
        }
    }
}
