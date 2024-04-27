package C_Rank.C_04;

import java.util.Scanner;

public class C052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height  = sc.nextInt();
        int width = sc.nextInt();
        sc.nextLine();

        int moveY = Math.abs(sc.nextInt());
        int moveX = Math.abs(sc.nextInt());

        int total = height * moveX + width * moveY;
        int result = total - moveX * moveY;

        System.out.println(result);
    }
}
