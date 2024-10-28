package Oct.Lab007_Condition_Loops;
import java.util.*;

public class Task019_odd_even_programme {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I will tell you odd or even");
        int num = sc.nextInt();
        if(num%2 == 0)
        {
            System.out.printf("The number is even %d",num);
        }
        else
        {
            System.out.printf("The number is odd %d",num);
        }
        sc.close();
    }
}
