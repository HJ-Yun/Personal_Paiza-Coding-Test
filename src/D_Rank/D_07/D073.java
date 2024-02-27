package D_Rank.D_07;

import java.util.Scanner;

public class D073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");
        String[] resultArray = new String[s.length()];

        if (1 <= s.length() && s.length() <= 100){
            for (int i = 0; i < s.length(); i++) {
                resultArray[i] = array[s.length() - i - 1];
            }
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.print(resultArray[i]);
        }
    }
}