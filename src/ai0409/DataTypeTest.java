package ai0409;

//기본자료형(1. 숫자형, 2.숫자가 아닌형)
public class DataTypeTest
{
    public static void main(String[] args)
    {
        //숫자형
        byte bt = 127; //-128 ~ 127
        short st = 300;
        st =bt;
        int it = st;
        System.out.println(it);
        long lg = 4324234;

        //실수형
        float fl = 1000;
        fl = lg;
        fl = 1000.0f;
        fl = (float) 1000.0;

        double db = 20000;
        db = fl;
        db = bt;
        db = 287.999;

        //문자형
        char c = 'A';
        System.out.println((int) c);
        System.out.println((char) (c+3)); //유니코드 값 연산

        //논리형
        boolean b = true;

        System.out.println(b);
        System.out.println(!b);

        System.out.println(bt == st);

    }
}
