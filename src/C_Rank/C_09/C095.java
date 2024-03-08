package C_Rank.C_09;

import java.util.Arrays;
import java.util.Scanner;

public class C095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String first = sc.nextLine();
        String last = sc.nextLine();

        String[] firstArray = first.split("");
        String[] lastArray = last.split("");

        if (first.length() != last.length()){
            System.out.print("NO");
        } else {
            if (first.equals(last)) {
                System.out.print("NO");
            } else {
                int[] firstArrayCount = sum(firstArray);
                int[] lastArrayCount = sum(lastArray);

                if (Arrays.equals(firstArrayCount,lastArrayCount)){
                    System.out.print("YES");
                } else {
                    System.out.print("NO");
                }
            }
        }
    }

    public static int[] sum(String[] word){
        int[] wordCount = new int[26];
        for (int i = 0; i < word.length; i++){
            switch (word[i]){
                case "a":
                    wordCount[0]++;
                    break;
                case "b":
                    wordCount[1]++;
                    break;
                case "c":
                    wordCount[2]++;
                    break;
                case "d":
                    wordCount[3]++;
                    break;
                case "e":
                    wordCount[4]++;
                    break;
                case "f":
                    wordCount[5]++;
                    break;
                case "g":
                    wordCount[6]++;
                    break;
                case "h":
                    wordCount[7]++;
                    break;
                case "i":
                    wordCount[8]++;
                    break;
                case "j":
                    wordCount[9]++;
                    break;
                case "k":
                    wordCount[10]++;
                    break;
                case "l":
                    wordCount[11]++;
                    break;
                case "m":
                    wordCount[12]++;
                    break;
                case "n":
                    wordCount[13]++;
                    break;
                case "o":
                    wordCount[14]++;
                    break;
                case "p":
                    wordCount[15]++;
                    break;
                case "q":
                    wordCount[16]++;
                    break;
                case "r":
                    wordCount[17]++;
                    break;
                case "s":
                    wordCount[18]++;
                    break;
                case "t":
                    wordCount[19]++;
                    break;
                case "u":
                    wordCount[20]++;
                    break;
                case "v":
                    wordCount[21]++;
                    break;
                case "w":
                    wordCount[22]++;
                    break;
                case "x":
                    wordCount[23]++;
                    break;
                case "y":
                    wordCount[24]++;
                    break;
                case "z":
                    wordCount[25]++;
                    break;
            }
        }
        return wordCount;
    }
}
