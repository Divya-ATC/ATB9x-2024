package Oct.Lab007_Condition_Loops;
import java.util.*;
public class Task015_If_else_Loop
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        //Allowed to vote or not
        //if else condition from the user input
        if (age>=18)
        {
            System.out.printf("The person is allowed to vote %d",age);
        }
        else
        {
            System.out.printf("The person is not allowed to vote %d",age);
        }
        sc.close();
    }
}
