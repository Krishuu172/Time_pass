import java.util.Scanner;
public class greeting
{
    public static void main (String [] args)
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter YOur Name");
        String name = s.nextLine();
        System.out.println("Hello "+name+" have a good day");
    }
}