package D_Rank.D_14;

import java.util.Scanner;

public class D144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");

        double result = 0;
        for (int i = 0; i < s.length(); i++){
            result += Integer.parseInt(array[i]) * Math.pow(2.0,s.length()-i - 1);
        }

        System.out.print((int) result);
    }
}
