package D_Rank.D_09;

import java.util.Scanner;

public class D094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] array = new String[3];

        for (int i = 0; i <3; i++){
            array[i] = sc.next();
        }

        int dog = 0;
        int cat = 0;

        for (int i = 0; i < 3; i++){
            if (array[i].equals("dog")){
                dog++;
            } else if (array[i].equals("cat")) {
                cat++;
            } else break;
        }

        if (dog > cat){
            System.out.print("dog");
        } else if (dog < cat) {
            System.out.print("cat");
        }
    }
}
