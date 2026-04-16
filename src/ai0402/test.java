package ai0402;

import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("============== 시험 합격여부 확인 ==============");
        System.out.println("시험 점수 : ");
        double score = s.nextDouble();

        if(score >= 70)
        {
            System.out.println("합격");
        }
        else
        {
            System.out.println("불합격");
        }

        s.close();
    }
}
