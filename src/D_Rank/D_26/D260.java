package D_Rank.D_26;

import java.util.Scanner;

public class D260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int lengthA = a.length();
        int lengthB = b.length();

        if (lengthA < lengthB){
            System.out.print(a);
        } else {
            System.out.print(b);
        }
    }
}
