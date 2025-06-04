import java.util.Scanner;
public class Task011
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        String loginid = "bharath";
        String pwd = "12345678";
        int count = 0;
        System.out.println("welcome to Login system");

        while (loginid.equals("bharath") && pwd.equals("12345678"))
        {
            System.out.println("you have logged in for " + count++ +"times");
            System.out.println("enter your login id");
            loginid = sc.nextLine();
            System.out.println("enter your password ");
            pwd = sc.nextLine();

            if(loginid.equals("bharath")&&pwd.equals("12345678"))
            {
                System.out.println("Login succefull");
                break;
            }
            else
            {
                System.out.println("invalid login id or password" );
                break;

            }

        }

        sc.close();
    }
}
