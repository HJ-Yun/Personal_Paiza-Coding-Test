package D_Rank.D_02;

import java.util.Scanner;
import java.util.regex.Pattern;

public class D014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        if (Pattern.matches("^[a-z]*$",line)){
            System.out.print(line.toUpperCase());
        }
    }
}
