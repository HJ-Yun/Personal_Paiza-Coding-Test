package D_Rank.D_06;

import java.util.Scanner;

public class D062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int h3 = sc.nextInt();

        String[] array = {"A","B","C","D","E","F","G","H","I","J"};

        if (1 <= h1 && h1 <= 10){
            if (1 <= h2 && h2 <= 10){
                if (1 <= h3 && h3 <= 10){
                    if (h1 + h2 + h3 == 10){
                        for (int i = 0; i < h1; i++){
                            System.out.print(array[i]);
                        }
                        System.out.println();
                        for (int i = h1; i < h1 + h2; i++){
                            System.out.print(array[i]);
                        }
                        System.out.println();
                        for (int i = h1 + h2; i < h1+ h2+ h3; i++){
                            System.out.print(array[i]);
                        }
                    }
                }
            }
        }
    }
}
