package C_Rank.C_05;

import java.util.Scanner;

public class C055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String find = sc.nextLine();

        String[] array = new String[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextLine();
        }

        int none = 0;
        for (int i = 0; i < n; i++){
            boolean result = array[i].contains(find);

            if (result){
                System.out.print(array[i]);
                if (i < n-1){
                    System.out.println();
                }
            } else {
                none++;
            }
        }
        if (none == n){
            System.out.print("None");
        }
    }
}
