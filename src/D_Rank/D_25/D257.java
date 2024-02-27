package D_Rank.D_25;

import java.util.Scanner;

public class D257 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");

        if (array[s.length()-1].equals("d")){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
