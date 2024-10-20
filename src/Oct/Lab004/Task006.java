package Oct.Lab004;
import java.util.Scanner;

public class Task006
{
    public static void main(String[] args)
    {
        //ternary operator example
        //find the greatest number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value 1 : ");
        int NUM_1 = sc.nextInt();
        System.out.println("Enter the value 2 :");
        int NUM_2 = sc.nextInt();

        System.out.println(NUM_1);
        System.out.println(NUM_2);

        int MAX = (NUM_1 > NUM_2) ? NUM_1 : NUM_2;
        System.out.println("Largest NUM is the " + MAX);
        sc.close();
    }
}
