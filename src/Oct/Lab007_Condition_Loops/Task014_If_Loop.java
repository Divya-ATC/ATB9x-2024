package Oct.Lab007_Condition_Loops;
import java.util.*;

public class Task014_If_Loop
{
    public static void main(String[] argc)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        //Allowed to vote or not
        if(age>= 18)
        {
            System.out.printf("The person is allowed to vote %d",age);
        }

    }

}
