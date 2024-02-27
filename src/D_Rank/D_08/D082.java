package D_Rank.D_08;

import java.util.Scanner;

public class D082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        String[] arrayA = a.split("");
        String[] arrayB = b.split("");

        if (2 <= a.length() && a.length() <= 20){
            if (2 <= b.length() && b.length() <= 20){
                if (arrayA[a.length()-1].equals("n")){
                    System.out.print("NG");
                } else if (arrayB[b.length()-1].equals("n")){
                    System.out.print("NG");
                } else if (arrayA[a.length() - 1].equals(arrayB[0])) {
                    System.out.print("OK");
                } else {
                    System.out.print("NG");
                }
            }
        }
    }
}
