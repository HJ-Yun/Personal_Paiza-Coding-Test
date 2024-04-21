package C_Rank.C_07;

import java.util.Scanner;

public class C074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int yy = sc.nextInt();
        sc.nextLine();

        String[] oldString= new String[x];
        String all = "";
        for (int i = 0; i < x; i++){
            oldString[i] = sc.nextLine();
            all += oldString[i];
        }

        int xx = 0;
        if (all.length() % yy == 0){
            xx = all.length() / yy;
        } else {
            xx = all.length() / yy + 1;
        }

        String[] newString = new String[xx];
        for (int i = 0, j= 0; i < xx; i++, j += yy){
            if (j + yy >= all.length()){
                newString[i] = all.substring(j);
            } else {
                newString[i] = all.substring(j, j + yy);
            }
            System.out.println(newString[i]);
        }
    }
}
