package ai0416;

import java.util.Scanner;

public class OverlabIfTest {
    public static void main(String[] args) {
        System.out.println("====== 특정 범위 숫자 판별 프로그램");
        Scanner s = new Scanner(System.in);
        System.out.println("정수를 입력");
        int num = s.nextInt();

        if(num>100){
            if(num < 1000)
                System.out.printf("입력된 숫자 %d(은)는 100보다 크고 1000보다 작다\n", num);
            else
                System.out.printf("입력된 숫자 %d(은)는 1000보다 크다\n", num);
        }
        else{
            System.out.printf("입력된 숫자 %d은(는) 100보다 작다", num);
        }
    }
}
