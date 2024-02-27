package D_Rank.D_20;

import java.util.Scanner;

public class D209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String find = Integer.toString(n);
        String buffer = sc.nextLine();
        String s = sc.nextLine();
        String[] array = s.split("");

        int result = 0;
        for (int i = 0; i < s.length(); i++){
            if (array[i].equals(find)){
                result++;
            }
        }

        System.out.print(result);
    }
}
