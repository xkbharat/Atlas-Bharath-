import java.util.Scanner;

import static java.util.Scanner.*;

public class Task006
{
    public static void main(String[]args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Id :");
        String id = scanner.nextLine();
        System.out.println(("Pwd"));
        String pass = scanner.nextLine();
        String maskedpass = " ";
        for (int i = 0 ; i < pass.length(); i++)
        {
            maskedpass += "*";
        }
        System.out.println("\nHi,\n");
        System.out.println("\t you login id : " + id);
        System.out.println("you pawd is : " + maskedpass);
        scanner.close();



    }
}
