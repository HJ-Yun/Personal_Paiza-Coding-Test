package D_Rank.D_08;

import java.util.Scanner;

public class D079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");

        if (2 <= s.length() && s.length() <= 100){
            int result = 0;

            for (int i = 0; i < s.length(); i++){
                if (array[0].equals(array[i])){
                    result++;
                }
            }

            if (result == s.length()){
                System.out.print("NG");
            } else {
                System.out.print("OK");
            }
        }
    }
}
