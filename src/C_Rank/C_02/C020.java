package C_Rank.C_02;

import java.util.Scanner;

public class C020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();

        if (p == 100){
            q = 0;
        }

        double afterP = m * (1 - p/100.0);
        double afterQ = afterP * (1 - q/100.0);

        System.out.print(afterQ);
    }
}
