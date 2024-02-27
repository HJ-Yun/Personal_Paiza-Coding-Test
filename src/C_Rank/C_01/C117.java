package C_Rank.C_01;

import java.util.Scanner;

public class C117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //가게수
        int m = sc.nextInt(); //영업 개월수

        int a = sc.nextInt(); //초기비용
        int b = sc.nextInt(); //매월 인건비
        int c = sc.nextInt(); //라면 1개당 이윤

        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt(); //각 가게의 판매수
        }

        int[] sell = new int[n];
        for (int i = 0; i < n; i++){
            sell[i] = array[i] * c; //각 가게의 매출
        }

        int[] earn = new int[n];
        for (int i = 0; i < n; i++){
            earn[i] = sell[i] - a - (b * m);
        }

        int result = 0;
        for (int i = 0; i < n; i++){
            if (earn[i] < 0){
                result++;
            }
        }
        System.out.print(result);
    }
}
