package Oct.Lab007_Condition_Loops;
import java.util.*;

public class Task020_greater_number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number 1");
        int num1 = sc.nextInt();
        System.out.printf("Enter the number 2");
        int num2 = sc.nextInt();

        if(num1>num2)
        {
            System.out.println("The num1 is greater");

        }
        else if(num2>num1)
        {
            System.out.println("The num2 is greater");

        }
        else
        {
            System.out.println("Both the numbers are equal");
        }
    }
}
