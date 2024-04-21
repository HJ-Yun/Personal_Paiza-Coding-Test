package C_Rank.C_11;

import java.util.Arrays;
import java.util.Scanner;

public class C119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int boy = sc.nextInt();
        int goHome = sc.nextInt();
        String buffer = sc.nextLine();

        int[] action = new int[boy];
        for (int i = 0; i < boy; i++){
            action[i] = sc.nextInt();
        }

        int[] home = new int[n];
        Arrays.fill(home, 1);

        for (int i = 0; i < boy; i++){
            home[action[i]-1] = 0;
        }

        int cookie = 0;
        int cry = 0;
        for (int i = 0; i < n; i++) {
            if (home[i] == 0) {
                cry++;

                int j = i + 1;
                if (cry == goHome) {
                    break;
                } else if (j < n && home[j] == 1) {
                    cry = 0;
                }
            } else {
                cookie++;
            }
        }
        System.out.println(cookie);
    }
}
