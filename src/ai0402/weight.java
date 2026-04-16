package ai0402;

import java.util.Scanner;

public class weight
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("무게(lb) : ");
        double lb = s.nextDouble();
        double new_lb = lb*0.453592;
        System.out.printf("무게(kg) : %.3f%n", new_lb);

        System.out.println("무게(kg) : ");
        double kg = s.nextDouble();
        double new_kg = kg*2.204623;
        System.out.printf("무게(lb): %.3f", new_kg);

        s.close();
    }
}
