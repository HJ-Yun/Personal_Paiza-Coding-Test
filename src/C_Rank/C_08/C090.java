package C_Rank.C_08;

import java.util.Scanner;

public class C090 {
    public static int call(String[] input){
        int result = 0;
        for (int i = 0; i < input.length; i++){
            switch (input[i]) {
                case "0":
                    result += 12;
                    break;
                case "1":
                    result += 3;
                    break;
                case "2":
                    result += 4;
                    break;
                case "3":
                    result += 5;
                    break;
                case "4":
                    result += 6;
                    break;
                case "5":
                    result += 7;
                    break;
                case "6":
                    result += 8;
                    break;
                case "7":
                    result += 9;
                    break;
                case "8":
                    result += 10;
                    break;
                case "9":
                    result += 11;
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();
        String[] array = num.split("-");

        String[] front = array[0].split("");
        String[] middle = array[1].split("");
        String[] back = array[2].split("");

        int result = 0;

        result += call(front);
        result += call(middle);
        result += call(back);

        System.out.print(result*2);
    }
}
