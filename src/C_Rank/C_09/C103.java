package C_Rank.C_09;

import java.util.Scanner;

public class C103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int condition = sc.nextInt();
        sc.nextLine();

        String[][] conditionArray = new String[condition][2];
        for (int i = 0; i < condition; i++){
            for (int j = 0; j < 2; j++){
                conditionArray[i][j] = sc.next();
            }
            sc.nextLine();
        }

        int check = 0;
        for (int i = 1; i < count+1; i++){
            for (int j = 0; j < condition; j++){
                if (i % Integer.parseInt(conditionArray[j][0]) == 0){
                    System.out.print(conditionArray[j][1]);
                    ++check;
                    for (int k = j+1; k < condition; k++){
                        if (i % Integer.parseInt(conditionArray[k][0]) == 0){
                            System.out.print(" ");
                            break;
                        }
                    }
                }

                if (j == condition-1 && check == 0){
                    System.out.print(i);
                }
            }
            check = 0;
            System.out.println();
        }
    }
}
