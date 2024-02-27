package D_Rank.D_14;

import java.util.Scanner;

public class D140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String buffer = sc.nextLine();

        String s = sc.nextLine();
        String[] array = s.split(" ");

        System.out.print(array[n - 1]);
    }
}
