package C_Rank.C_09;

import java.util.Scanner;

public class C101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        int check = 0;
        for (int i = 0; i < 365; i++){
            int hundred = i / 100;
            int ten = (i - hundred * 100) / 10;
            int one = i - hundred * 100 - ten * 10;

            int tenOver = i / 10;
            int tenUnder = i - hundred * 100;

            if (i >= 100){
                if (hundred == num){
                    check++;
                } else if (ten == num) {
                    check++;
                } else if (one == num) {
                    check++;
                } else if (tenOver == num) {
                    check++;
                } else if (tenUnder == num) {
                    check++;
                } else if (i == num) {
                    check++;
                }
            } else if (i >= 10) {
                if (ten == num) {
                    check++;
                } else if (one == num) {
                    check++;
                } else if (i == num) {
                    check++;
                }
            } else {
                if (i == num) {
                    check++;
                }
            }
        }
        System.out.print(check);
    }
}
