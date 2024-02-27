package D_Rank.D_02;

import sun.awt.SunHints;

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class D017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        int n3 = Integer.parseInt(sc.nextLine());
        int n4 = Integer.parseInt(sc.nextLine());
        int n5 = Integer.parseInt(sc.nextLine());

        int[] array = new int[5];
        array[0] = n1;
        array[1] = n2;
        array[2] = n3;
        array[3] = n4;
        array[4] = n5;

        for (int i = 0; i < 5; i++){
            if (array[i] >= 1 && array[i] <= 99){
                Arrays.sort(array);
            }
        }

        Arrays.sort(array);

        if (n1 >= 1 && n1 <= 99){
            if (n2 >= 1 && n2 <= 99){
                if (n3 >= 1 && n3 <= 99){
                    if (n4 >= 1 && n4 <= 99){
                        if (n5 >= 1 && n5 <= 99){
                            System.out.println(array[4]);
                            System.out.print(array[0]);
                        }
                    }
                }
            }
        }
    }
}
