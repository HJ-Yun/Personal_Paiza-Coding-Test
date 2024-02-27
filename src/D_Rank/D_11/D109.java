package D_Rank.D_11;

import java.util.Scanner;

public class D109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        String d = sc.next();

        String[] arrayM = m.split("");
        String[] arrayD = d.split("");

        int result = 0;

        for (int i = 0; i < m.length(); i++){
            for (int j = 0; j < d.length(); j++){
                if (arrayM[i].equals(arrayD[j])){
                    result++;
                }
            }
        }

        if (result == m.length() * d.length()){
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
