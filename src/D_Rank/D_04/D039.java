package D_Rank.D_04;

import java.util.Scanner;

public class D039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (1 <= a && a<= 100){
            if (1 <= b && b <= 100){
                if (1 <= c && c <=100){
                    if (a != b){
                        System.out.print("NO");
                    } else if (b != c) {
                        System.out.print("NO");
                    } else {
                        System.out.print("YES");
                    }
                }
            }
        }
    }
}
