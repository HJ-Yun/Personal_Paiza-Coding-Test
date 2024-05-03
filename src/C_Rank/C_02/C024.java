package C_Rank.C_02;

import java.util.Scanner;

public class C024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] array = new String[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextLine();
        }

        //SET ADD SUB

        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++){
            String[] order = array[i].split(" ");
            int buffer = 0;
            if (order[0].equals("SET")){
                if (order[1].equals("1")){
                    a = Integer.parseInt(order[2]);
                } else if (order[1].equals("2")) {
                    b = Integer.parseInt(order[2]);
                }
            } else if (order[0].equals("ADD")) {
                buffer = a + Integer.parseInt(order[1]);
                b = buffer;
            } else if (order[0].equals("SUB")) {
                buffer = a - Integer.parseInt(order[1]);
                b = buffer;
            }
        }
        System.out.printf("%d %d",a,b);
    }
}
