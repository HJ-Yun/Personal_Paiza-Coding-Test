package D_Rank.D_11;

import java.util.Scanner;

public class D113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] array = s.split(":");

        int hour = Integer.parseInt(array[0]) - 8;
        int min = Integer.parseInt(array[1]);

        if (hour < 0){
            hour = 24 + hour;
            System.out.printf("%d:%d",hour,min);
        } else {
            System.out.printf("%d:%d",hour,min);
        }
    }
}
