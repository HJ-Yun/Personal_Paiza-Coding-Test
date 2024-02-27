package C_Rank.C_01;

import java.util.Scanner;

public class C039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");

        int result = 0;
        for (int i = 0; i < s.length(); i++){
            if (array[i].equals("<")){
                result += 10;
            } else if (array[i].equals("/")) {
                result += 1;
            } else {
                //empty
            }
        }

        System.out.print(result);
    }
}
