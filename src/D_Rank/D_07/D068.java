package D_Rank.D_07;

import java.util.Scanner;

public class D068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String buffer = sc.nextLine();
        String s = sc.nextLine();
        String[] array = s.split("");

        int result = 0;

        if (1 <= n && n <= 100){
            for (int i = 0; i < s.length(); i++){
                if (array[i].equals("S")){
                    result++;
                }
            }
        }
        System.out.printf("%d %d",result,s.length()-result);
    }
}
