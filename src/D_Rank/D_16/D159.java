package D_Rank.D_16;

import java.util.Scanner;

public class D159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        int n1 = s1.length();
        int n2 = s2.length();
        int n3 = s3.length();

        if (n1 >= n2){
            if (n1 >= n3){
                System.out.print(n1);
            } else {
                System.out.print(n3);
            }
        }
        else {
            if (n2 >= n3){
                System.out.print(n2);
            } else {
                System.out.print(n3);
            }
        }
    }
}
