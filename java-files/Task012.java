import java.util.Scanner;
public class Task012
{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        String loginid = "bharath";
        String pwd = "1234";
        int count = 0;
        System.out.println("welcome to login page");
        do {
            System.out.println("you have logged in for " + count++ + "times");
            System.out.println("enter your login id :");
            loginid = sc.nextLine();
            System.out.println("enter your password :");
            pwd = sc.nextLine();
            if (loginid.equals("bharath") && pwd.equals("1234")) {
                System.out.println("Login succesfull");
                break;
            } else {
                System.out.println("Login failed invalid loginid or password");
                break;
            }


        }
        while (loginid.equals("bharath") && pwd.equals("1234"));
        sc.close();

    }


}
