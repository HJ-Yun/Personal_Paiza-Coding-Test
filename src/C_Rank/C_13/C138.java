package C_Rank.C_13;

import java.util.Scanner;

public class C138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int person = sc.nextInt();
        sc.nextLine();

        int[] number = new int[person];
        for (int i = 0; i < person; i++){
            number[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < person; i++){
            int top = 0;
            for (int j = 0; j < person; j++){
                if (number[i] < number[j]){
                    top++;
                }
            }
            System.out.print(top+1);

            if (i != person-1){
                System.out.println();
            }
        }
    }
}
