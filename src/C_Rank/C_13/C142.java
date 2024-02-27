package C_Rank.C_13;

import java.util.Scanner;

public class C142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int n = sc.nextInt();
        String nbuffer = sc.nextLine();

        String menu = sc.nextLine();
        String[] word = menu.split(" ");

        int no = 0;
        for (int i = 0; i < n - 1; i++){
            if (word[i].equals(s)){
                System.out.print("Yes");
                break;
            } else if (word[n-1].equals(s)) {
                System.out.print("Yes");
                break;
            } else {
                no++;
            }
        }
        if (no == (n-1)){
            System.out.print("No");
        }
    }
}