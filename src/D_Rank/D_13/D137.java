package D_Rank.D_13;

import java.util.Scanner;

public class D137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");

        int result = 0;
        for (int i = 0; i < s.length(); i++){
            if (array[i].equals("y")){
                result++;
            }
        }

        System.out.print(result);
    }
}
