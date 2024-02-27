package D_Rank.D_22;

import java.util.Scanner;

public class D228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int h = sc.nextInt();

        int t = sc.nextInt();
        int m = sc.nextInt();

        if (s > t){
            System.out.print("Yes");
        } else if (s == t) {
            if (h >= m){
                System.out.print("Yes");
            } else {
                System.out.print("No");
            }
        } else {
            System.out.print("No");
        }
    }
}
