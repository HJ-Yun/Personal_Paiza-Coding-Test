package D_Rank.D_24;

import java.util.Scanner;

public class D247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");

        System.out.printf("%s%s",array[0],array[s.length()-1]);
    }
}
