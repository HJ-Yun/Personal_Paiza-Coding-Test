package C_Rank.C_06;

import java.util.Scanner;

public class C072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int atk = sc.nextInt();
        int def = sc.nextInt();
        int agi = sc.nextInt();
        sc.nextLine();

        int n = sc.nextInt();
        sc.nextLine();

        String[][] evolution = new String[n][7];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 7; j++){
                evolution[i][j] = sc.next();
            }
            sc.nextLine();
        }

        int check = 0;
        int judge = 0;
        for (int i = 0; i < n; i++){
            if (Integer.parseInt(evolution[i][1]) <= atk && atk <= Integer.parseInt(evolution[i][2])){
                check++;
                if (Integer.parseInt(evolution[i][3]) <= def && def <= Integer.parseInt(evolution[i][4])){
                    check++;
                    if (Integer.parseInt(evolution[i][5]) <= agi && agi <= Integer.parseInt(evolution[i][6])){
                        check++;
                        System.out.println(evolution[i][0]);
                    }
                }
            }
            if (check != 3){
                judge++;
                check = 0;
            }
        }

        if (judge == n){
            System.out.println("no evolution");
        }
    }
}
