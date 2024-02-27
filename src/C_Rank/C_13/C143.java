package C_Rank.C_13;

import java.util.Scanner;

public class C143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String file = sc.nextLine();
        String[] word = file.split("");

        for (int i = 0; i < file.length()-1; i++){
            if (word[i].equals("-") && word[i].equals(word[i+1])){
                word[i] = "";
            }
        }

        for (int i = 0; i < file.length(); i++){
            System.out.print(word[i]);
        }
    }
}
