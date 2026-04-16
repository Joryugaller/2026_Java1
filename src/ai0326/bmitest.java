package ai0326;

import java.util.Calendar;
import java.util.Scanner;

public class bmitest
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.print("체중(kg) : ");
        double weight = s.nextDouble();
        System.out.print("키(cm) : ");
        double height = s.nextDouble();
        System.out.print("이름 : ");
        String name = s1.nextLine();

        double heightm = 0.01*height;
        double bmi = weight/Math.pow(heightm, heightm);



        System.out.println(name + "님의 bmi : " + bmi );
        s.close();
        s1.close();
    }
}