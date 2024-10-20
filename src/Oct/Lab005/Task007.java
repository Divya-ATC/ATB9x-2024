package Oct.Lab005;
import java.util.Scanner;
public class Task007
{
    public static void main(String[] argc)

    {
        // modulos functionality
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and check number is even or odd :");
        int n = sc.nextInt();
        // n % 2 = 0 = odd
        // n % 2 = 1 = even

        if (n % 2 == 0)
        {
            System.out.println("the num is even");
        } else
        {
            System.out.println("the num is odd");
        }
        sc.close();
    }
}
