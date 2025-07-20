import java.util.Scanner;

public class Adiition {
    public static void main(String[] args)
    {
        int c;
        Scanner Ide = new Scanner(System.in);
        System.out.println("Enter Value A :");
        int a = Ide.nextInt();
        System.out.println("Enter Value B :");
        int b = Ide.nextInt();
        c=a+b;
        System.out.println("Adiition is : "+c);
    }
}