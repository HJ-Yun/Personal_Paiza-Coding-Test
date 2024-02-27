package C_Rank.C_02;

import java.util.Scanner;

public class C086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");

        for (int i = 0; i < s.length(); i++){
            if (array[i].equalsIgnoreCase("A")){}
            else if (array[i].equalsIgnoreCase("E")){}
            else if (array[i].equalsIgnoreCase("I")){}
            else if (array[i].equalsIgnoreCase("O")){}
            else if (array[i].equalsIgnoreCase("U")){}
            else System.out.print(array[i]);
        }
    }
}
