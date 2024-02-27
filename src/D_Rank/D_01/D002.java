package D_Rank.D_01;

import java.util.Scanner;

public class D002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] array = line.split(" ");

        int s1 = Integer.parseInt(array[0]);
        int s2 = Integer.parseInt(array[1]);

        if (s1 == s2) {
            System.out.print("eq");
        } else {
            System.out.print(Math.max(s1, s2));
        }
    }
}