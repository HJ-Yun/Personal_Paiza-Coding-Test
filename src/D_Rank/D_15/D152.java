package D_Rank.D_15;

import java.util.Scanner;

public class D152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");
        int n = sc.nextInt();

        int r = 0;
        int w = 0;

        for (int i = 0; i < s.length(); i++){
            if (array[i].equals("R")){
                r++;
            } else if (array[i].equals("W")) {
                w++;
            }
        }
        
        if (r == 5){
            System.out.print("Yes");
        } else if (r >= n) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
