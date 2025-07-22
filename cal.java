import java.util.Scanner;
public class cal 
{
    public static void main (String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the opration \n 1 For additon \n 2 for Subtraction \n 3 for Division \n 4 for multiplication");
        int in = s.nextInt();
        System.out.println("Enter No 1 to add");
        int a = s.nextInt();
        System.out.println("Enter No 2 to add");
        int b = s.nextInt();
        int c;
        switch (in) 
        {
            case 1 :
            System.out.println("The Addition is "+ a+b);
            break;
            case 2:
            c=a-b;
            System.out.println("The Subtraction is :"+ c);
            break;
            case 3:
            if (a==0)
            {
                System.out.println("infinity");
            }
            else 
            {
                System.out.println("The Division is :"+ a/b);
            }
            break;
            case 4:
            System.out.println("The Multiplication is :" +(a*b));
            break;
            default:
            System.out.println("The input is out of optionss ayayyyyy");
        }
    }
}