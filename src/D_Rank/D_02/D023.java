package D_Rank.D_02;

import java.util.Scanner;

public class D023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a = 'A';
        int result = 0;

        for (int i = 0; i < s.length(); i++){
            if (a == s.charAt(i)){
                result++;
            }
        }
        System.out.print(result);
    }
}
