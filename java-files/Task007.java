class Customer
{
    void accept()
    {
        System.out.println("customer called");
    }
    void display()
    {
        System.out.println("customer displayed");
    }
}

public class Task007
{
    public static void main(String[] args)
    {
        Customer obj1 = new Customer();
        obj1.accept();
        obj1.display();
    }
}
