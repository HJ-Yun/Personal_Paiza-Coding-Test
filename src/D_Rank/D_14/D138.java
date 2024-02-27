package D_Rank.D_14;

import java.util.Scanner;

public class D138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();

        String[] array = new String[h];
        for (int i = 0; i < h; i++){
            array[i] = sc.next();
        }

        for (int i = 0; i < h; i++){
            if (array[i].length() == w){
                System.out.print(array[i]);
                if (i < h - 1){
                    System.out.println();
                }
            }
        }
    }
}
