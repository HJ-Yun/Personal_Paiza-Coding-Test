package C_Rank.C_08;

import java.util.Scanner;

public class C093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bob = sc.nextInt();
        int alice = sc.nextInt();

        int bob1 = bob / 100;
        int bob2 = (bob - bob1 * 100) / 10;
        int bob3 = bob - bob1 * 100 - bob2 * 10;

        int alice1 = alice / 100;
        int alice2 = (alice - alice1 * 100) / 10;
        int alice3 = alice - alice1 * 100 - alice2 * 10;

        int bobSum = bob1 + bob2 + bob3;
        int aliceSum = alice1 + alice2 + alice3;

        int bobResult = bobSum % 10;
        int aliceResult = aliceSum % 10;

        if (bobResult > aliceResult){
            System.out.println("Bob");
        } else if (bobResult < aliceResult) {
            System.out.println("Alice");
        } else {
            System.out.println("Draw");
        }
    }
}
