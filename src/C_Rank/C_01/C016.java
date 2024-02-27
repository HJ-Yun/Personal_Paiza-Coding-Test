package C_Rank.C_01;

import java.util.Scanner;

public class C016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");

        for (int i = 0; i < s.length(); i++){
            if (array[i].equals("A")){
                System.out.print(4);
            } else if (array[i].equals("E")) {
                System.out.print(3);
            } else if (array[i].equals("G")) {
                System.out.print(6);
            } else if (array[i].equals("I")) {
                System.out.print(1);
            } else if (array[i].equals("O")) {
                System.out.print(0);
            } else if (array[i].equals("S")) {
                System.out.print(5);
            } else if (array[i].equals("Z")) {
                System.out.print(2);
            } else {
                System.out.println(array[i]);
            }
        }
    }
}
