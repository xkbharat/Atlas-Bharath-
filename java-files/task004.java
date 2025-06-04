public class task004
{
    public static int add(int a , int b)
    {
        return a + b;
    }
    public static int sub(int a , int b)
    {
        return a - b;
    }
    public static int mul(int a , int b)
    {
        return a * b;
    }
    public static int div(int a, int b)
    {
        return a / b;
    }
    public static void main(String[]args)
    {
        int num1 = 10;
        int num2 = 2;

        System.out.println("sum of 2 num is " + add(num1, num2));
        System.out.println("sub of 2 num is " + sub(num1, num2));
        System.out.println("mul of 2 num is " + mul(num1, num2));
        System.out.println("div of 2 num is " + div(num1, num2));

    }
}