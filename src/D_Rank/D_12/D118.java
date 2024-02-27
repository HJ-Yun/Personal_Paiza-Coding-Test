package D_Rank.D_12;

import java.util.Scanner;

public class D118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();

        int result;
        int showa = 1926;
        int heisei = 1989;

        if (s.equals("S")){
            result = showa + n -1;
            System.out.print(result);
        } else if (s.equals("H")) {
            result = heisei + n -1;
            System.out.print(result);
        }
    }
}
