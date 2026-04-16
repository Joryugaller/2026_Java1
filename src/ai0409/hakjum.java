package ai0409;

import java.util.Scanner;

public class hakjum
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("학점 입력 : ");
        System.out.println("프로그래밍언어실습(3학점) : ");
        Double jh = s.nextDouble();
        System.out.println("웹프로그래밍기초(3학점) : ");
        Double mh = s.nextDouble();
        System.out.println("프롬프트엔지니어링(2학점) : ");
        Double eh = s.nextDouble();

        Double newjh = jh*3;
        Double newmh = mh*3;
        Double neweh = eh*2;

        Double average = (newjh + newmh + neweh) / 8;

        System.out.printf("학점 평균 : %.2f\n", average);

        s.close();

    }
}
