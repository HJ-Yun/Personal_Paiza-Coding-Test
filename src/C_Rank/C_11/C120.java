package C_Rank.C_11;

import java.util.Arrays;
import java.util.Scanner;

public class C120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        String list1 = sc.nextLine();
        String list2 = sc.nextLine();

        String[] array1 = list1.split("");
        String[] array2 = list2.split("");

        int result = 0;
        int rotate = 0;

        for (int i = 0; i < num; i++) {
            if (array1[i].equals(array2[i])) {
                result++;
            } else {
                String buffer = new String(array2[num - 1]);
                for (int j = num - 2; j >= 0; j--) {
                    array2[j + 1] = array2[j];
                }
                array2[0] = buffer;
                i = -1;
                result = 0;
                rotate++;

                if (rotate == num + 1){
                    break;
                }
            }
        }

        if(result == num){
            System.out.print("Yes");
        } else if(rotate == num + 1){
            System.out.println("No");
        }
    }
}
