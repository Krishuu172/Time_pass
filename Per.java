import java.util.Scanner;
// Program to calculate percentage og CNSE board exam of a 10th std student.
public class Per {
    public static void main (String[] args)
    {
        System.out.println("Enter Your Maths Marks : ");
        Scanner S = new Scanner(System.in);
        int M = S.nextInt();
        System.out.println("Enter Your English marks: ");
        int E = S.nextInt();
        System.out.println("Enter Your Hindi  marks: ");
        int H = S.nextInt();
        System.out.println("Enter Your History Marks : ");
        int Hi = S.nextInt();
        System.out.println("Enter Your Science Marks : ");
        int Sci = S.nextInt();
        double avg;
        int Total_marks =M+E+H+Hi+Sci;
        avg = (Total_marks/500.0)*100;                                     // USe float To do percentage because if we use integer it will become 0
        System.out.println("The Percentage For YOur Marks is :"+ avg+" %");
    }
}
