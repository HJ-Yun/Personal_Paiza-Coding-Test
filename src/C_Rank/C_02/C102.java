package C_Rank.C_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nA = sc.nextInt();
        int[] arrayA = new int[nA];
        for (int i = 0; i < nA; i++){
            arrayA[i] = sc.nextInt();
        }
        List<Integer> listA = new ArrayList<>();
        for (int number : arrayA){
            listA.add(number);
        }

        int nB = sc.nextInt();
        int[] arrayB = new int[nB];
        for (int i = 0; i < nB; i++){
            arrayB[i] = sc.nextInt();
        }
        List<Integer> listB = new ArrayList<>();
        for (int number : arrayB){
            listB.add(number);
        }

        int value = 2;
        for (int i = 1; i < 32; i++){
            if (listA.contains(i) && !listB.contains(i)){
                System.out.println("A");
            } else if (!listA.contains(i) && listB.contains(i)) {
                System.out.println("B");
            } else if (!listA.contains(i) && !listB.contains(i)) {
                System.out.println("x");
            } else {

                if (value % 2 == 0){
                    System.out.println("A");
                    value++;
                } else {
                    System.out.println("B");
                    value++;
                }
            }
        }
    }
}
