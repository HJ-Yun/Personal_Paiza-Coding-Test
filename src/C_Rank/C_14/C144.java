package C_Rank.C_14;

import java.util.Scanner;

public class C144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String buffer = sc.nextLine();

        String[] result = new String[n];
        for (int i = 0; i < n; i++){
            result[i] = sc.nextLine();
        }

        String[][] battle = new String[n][2];
        for (int i = 0; i < n; i++){
            battle[i] = result[i].split(" ");
        }

        int win = 0;
        for (int i = 0; i < n; i++){
            if (battle[i][0].equals("G") && battle[i][1].equals("C")){
                win++;
            } else if (battle[i][0].equals("P") && battle[i][1].equals("G")) {
                win++;
            } else if (battle[i][0].equals("C") && battle[i][1].equals("P")) {
                win++;
            }
        }

        System.out.print(win);
    }
}
