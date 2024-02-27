package D_Rank.D_13;

import java.util.Scanner;

public class D131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");

        for (int i = 0; i < s.length(); i++){
            if (array[i].equals("0")){
                System.out.print("C");
            } else if (array[i].equals("1")) {
                System.out.print("A");
            } else if (array[i].equals("2")) {
                System.out.print("B");
            }
        }
    }
}
