package D_Rank.D_11;

import java.util.Scanner;

public class D116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int beforeX = x / 100;
        int afterX = beforeX * 100;

        System.out.print(afterX);
    }
}
