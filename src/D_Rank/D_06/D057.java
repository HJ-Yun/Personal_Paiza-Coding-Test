package D_Rank.D_06;

import java.util.Arrays;
import java.util.Scanner;

public class D057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String buffer  = sc.nextLine();
        String line = sc.nextLine();
        String[] array = line.split(" ");

        if (1 <=n && n <= 3){
            for (int i = 0; i < 3; i++){
                if (1 <= array[i].length() && array[i].length() <= 20){

                } else break;
            }
            System.out.println(array[n-1]);
        }
    }
}
