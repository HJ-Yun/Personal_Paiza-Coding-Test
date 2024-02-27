package D_Rank.D_12;

import java.util.Scanner;

public class D121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result;

        if (s.contains("A")){
            result = s.replace('A','R');
            System.out.print(result);
        } else {
            System.out.print(s);
        }
    }
}
