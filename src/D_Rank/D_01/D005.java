package D_Rank.D_01;

import java.util.Scanner;

public class D005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s1 = Integer.parseInt(sc.next());
        int s2 = Integer.parseInt(sc.next());

        if (s1 >= 1 && s1 <= 100){
            if (s2 >= 1 && s2 <=100){
                System.out.print(s1 + " ");
                int sum = s1 + s2;
                for (int i = 0; i < 9; i++){
                    System.out.print(sum);
                    if (i < 8){
                        System.out.print(" ");
                    }
                    sum += s2;
                }
            }
        }
    }
}
