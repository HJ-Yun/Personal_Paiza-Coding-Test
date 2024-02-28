package C_Rank.C_11;

import java.util.Scanner;

public class C123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int person = sc.nextInt();
        sc.nextLine();

        int[] age = new int[person];
        for (int i = 0; i < person; i++){
            age[i] = sc.nextInt();
            sc.nextLine();
        }

        int order = sc.nextInt();
        sc.nextLine();

        int[][] robot = new int[order][3];
        for (int i = 0; i < order; i++){
            for (int j = 0; j < 3; j++){
                robot[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        int[] nuts = new int[person];

        for (int i = 0; i < order; i++){
            int first = robot[i][0]-1;
            int last = robot[i][1];
            int give = robot[i][2];

            for (int j = first; j < last; j++){
                if (age[j] >= nuts[j] + give){
                    nuts[j] += give;
                } else if (age[j] < nuts[j] + give) {
                    nuts[j] = age[j];
                }
            }
        }

        for (int i = 0; i < person; i++){
            System.out.print(nuts[i]);
            if (i != person-1){
                System.out.println();
            }
        }
    }
}
