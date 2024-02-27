package D_Rank.D_01;

import java.util.Scanner;

public class D011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String find ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.print(find.indexOf(N)+1); ;
    }
}
