package D_Rank.D_13;

import java.util.Scanner;

public class D127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String number = s.substring(1);
        int result = Integer.parseInt(number);
        System.out.println(result);

        if (result % 111 == 0){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
