package ai0319;

public class VariableTest2
{
    public static void main(String[] args)
    {
        int num1, num2, result, result2, result3;

        num1 = 300;
        num2 = 500;
        result = num1 + num2;
        result2 = num1 * num2;
        result3 = num1 / num2;
        //지역변수는 무조건 초기화하고 사용, 사용안한 변수는 흐림



        System.out.println(num1 + " + " + num2 + " = " + result );
        System.out.printf("%d + %d = %d\n", num1, num2, result);
        System.out.printf("%d * %d = %d\n", num1, num2, result2);
        System.out.printf("%d ÷ %d = %d", num1, num2, result3);
    }
}
