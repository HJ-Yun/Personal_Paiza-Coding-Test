package D_Rank.D_15;

import java.util.Scanner;

public class D149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");
        int n = sc.nextInt();

        for (int i = 0; i < s.length(); i++){
            if (i != (n - 1)){
                System.out.print(array[i]);
            }
        }
    }
}
