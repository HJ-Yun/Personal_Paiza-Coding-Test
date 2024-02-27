package D_Rank.D_06;

import java.util.Scanner;

public class D059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] card = line.split(" ");

        if (card[0].equals("J") && card[1].equals("J")){
            card[1] = "Q";
            System.out.printf("%s %s",card[0],card[1]);
        } else {
            System.out.printf("%s %s",card[0],card[1]);
        }
    }
}
