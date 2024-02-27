package D_Rank.D_18;

import java.util.Scanner;

public class D184 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String buffer = sc.nextLine();
        String s = sc.nextLine();
        String[] array = s.split("");

        if (n == s.length()){
            for (int i = 0; i < n; i++){
                System.out.print(array[i]);
                if (i < n - 1){
                    System.out.println();
                }
            }
        }
    }
}
