package D_Rank.D_20;

import java.util.Scanner;

public class D203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");
        String c = sc.nextLine();
        int n = sc.nextInt();

        if (array[n-1].equals(c)){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
