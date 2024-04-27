package C_Rank.C_06;

import java.util.Arrays;
import java.util.Scanner;

public class C067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int originNum = sc.nextInt();
        sc.nextLine();

        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
            sc.nextLine();
        }

        int[] changeNum = new int[35];
        Arrays.fill(changeNum,0);

        for (int i = 34; i > -1; i--){
            changeNum[i] = originNum % 2;
            originNum /= 2;
        }

        for (int i = 0; i < n; i++){
            System.out.println(changeNum[34 - (array[i]-1)]);
        }
    }
}
