package D_Rank.D_07;

import java.util.Scanner;

public class D071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();

        if (0 <= t && t <= 40){
            if (0 <= m && m <= 100){
                if (t >= 25 && m <= 40){
                    System.out.println("No");
                } else if (t >= 25 || m <= 40) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
