package D_Rank.D_05;

import java.util.Scanner;

public class D053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (1 <= s.length() && s.length() <= 20){
            if (s.equals("candy") || s.equals("chocolate")){
                System.out.print("Thanks!");
            } else {
                System.out.print("No!");
            }
        }
    }
}
