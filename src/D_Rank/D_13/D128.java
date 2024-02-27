package D_Rank.D_13;

import java.util.Scanner;

public class D128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String buffer = sc.nextLine();
        String s = sc.nextLine();

        String[] array = s.split(" ");
        for (int i = 0; i < n; i++){
            System.out.print(array[i].charAt(0));
        }
    }
}
