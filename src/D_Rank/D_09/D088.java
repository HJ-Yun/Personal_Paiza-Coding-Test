package D_Rank.D_09;

import java.util.Scanner;

public class D088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int u = sc.nextInt();

        int result = 0;

        if (-40 <= t && t <= 40){
            if (-40 <= u && u <= 40){
                result = t - u;
                System.out.print(result);
            }
        }
    }
}
