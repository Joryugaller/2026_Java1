package ai0326;

import java.util.Scanner;

public class Lab1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("체중(kg) : ");
        double weight = s.nextDouble();
        System.out.print("키(cm) : ");
        double height = s.nextDouble();
        double heightcm = 0.01*height;

        System.out.println("bmi : " + (weight / heightcm*heightcm));
        s.close();
    }
}
