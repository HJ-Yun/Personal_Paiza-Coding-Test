package D_Rank.D_05;

import java.util.Scanner;

public class D047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        if (1 <= s1.length() && s1.length() <= 20){
            if (1 <= s2.length() && s2.length() <= 20){
                if (1 <= s3.length() && s3.length() <= 20){
                    System.out.printf("Gold %s",s1);
                    System.out.printf("Silver %s",s2);
                    System.out.printf("Bronze %s",s3);
                }
            }
        }
    }
}
