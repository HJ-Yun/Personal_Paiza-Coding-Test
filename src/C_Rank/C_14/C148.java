package C_Rank.C_14;

import java.util.Scanner;

public class C148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int myLevel = sc.nextInt();
        String buffer = sc.nextLine();

        int[] battle = new int[n];
        for (int i = 0; i < n; i++){
            battle[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (myLevel > battle[i]){
                myLevel += battle[i] / 2;
            } else if (myLevel < battle[i]) {
                myLevel  = myLevel / 2;
            }
        }

        System.out.println(myLevel);
    }
}
