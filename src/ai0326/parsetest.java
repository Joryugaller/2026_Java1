package ai0326;

import java.sql.SQLOutput;
import java.util.Scanner;

public class parsetest
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        System.out.println("이름 : ");
        String name = s.nextLine();
        System.out.println("주소 : ");
        String address = s.nextLine();
        System.out.println("무게 (g) : ");
        double weight = s.nextDouble();

        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
        System.out.println("배송비 : " + (weight*5));




    }
}
