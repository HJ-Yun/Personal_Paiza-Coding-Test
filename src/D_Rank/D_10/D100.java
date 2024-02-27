package D_Rank.D_10;

import java.util.Scanner;

public class D100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] array = s.split("");

        int a = 0;
        int b = 0;

        for (int i = 0; i < s.length(); i++){
            if (array[i].equals("_")){
                a++;
            } else if (array[i].equals("-")) {
                b++;
            }
        }

        System.out.println(a);
        System.out.println(b);

        if (a == b){
            String result = s.replace('-','_');
            System.out.print(result);
        } else if (a > b) {
            String result = s.replace('-','_');
            System.out.print(result);
        } else {
            String result = s.replace('_','-');
            System.out.print(result);
        }
    }
}
