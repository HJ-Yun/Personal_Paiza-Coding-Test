package C_Rank.C_11;

import java.util.Scanner;

public class C114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String buffer = sc.nextLine();

        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLine();
        }

        char a;
        char b;
        int ok = 0;
        for (int i = 0; i < n-1; i++){
            a = array[i].charAt(array[i].length()-1);
            b = array[i+1].charAt(0);

            if (a != b){
                System.out.printf("%c %c",a,b);
                break;
            } else {
               ok++;
            }
        }

        if (ok == n-1){
            System.out.print("Yes");
        }
    }
}
