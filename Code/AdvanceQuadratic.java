import java.util.Scanner;

public class AdvanceQuadratic
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Advance Quadractic!");


        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = userInput.nextDouble();
        System.out.print("Enter b: ");
        double b = userInput.nextDouble();
        System.out.print("Enter c: ");
        double c = userInput.nextDouble();


        double discriminant = (b * b) - (4.0 * a * c);
        double d = Math.sqrt(discriminant);
        

        if (discriminant >= 0)
        {
            if (a == 0)
            {
                System.out.println("Undefined");
            }
            else
            {
                System.out.println("The solutions are: ");
                System.out.println((-b + d)/(2.0 * a));
                System.out.println((-b - d)/(2.0 * a));
            }
        }
        else 
        {
            System.out.println("No real solutions");
        }


        System.out.println("The discriminant is: ");
        System.out.println(discriminant);
    }
}
