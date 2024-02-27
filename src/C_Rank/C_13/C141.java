package C_Rank.C_13;

import java.util.Scanner;

public class C141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String buffer = sc.nextLine();
        String[] array = new String[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextLine();
        }

        int totalArray[] = new int[n];
        for (int i = 0; i < n; i++){
            int total = 0;
            for (int j = 0; j < n; j++){
                if (array[i].equals(array[j])){
                    total++;
                }
            }
            totalArray[i] = total;
        }

        int max = totalArray[0];
        int result = 0;
        for (int i = 1; i < n; i++){
            if (totalArray[i] >= max){
                max = totalArray[i];
                result = i;
            }
        }
        System.out.print(array[result]);
    }
}
