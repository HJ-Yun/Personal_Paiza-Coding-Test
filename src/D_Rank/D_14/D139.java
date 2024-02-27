package D_Rank.D_14;

import java.util.Scanner;

public class D139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String buffer = sc.nextLine();
        String s = sc.nextLine();
        String[] array = s.split(" ");

        int g = 0;
        int p = 0;

        for (int i = 0; i < n; i++){
            if (array[i].equals("G")){
                g++;
            } else if (array[i].equals("P")) {
                p++;
            }
        }

        if (g < p){
            System.out.print("G");
        } else if (g > p) {
            System.out.print("P");
        } else {
            System.out.print("Draw");
        }
    }
}
