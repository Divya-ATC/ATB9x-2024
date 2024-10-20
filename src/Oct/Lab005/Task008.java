package Oct.Lab005;
import java.util.Scanner;

public class Task008
{
    public static void main(String[] argc)
    {
        Scanner sc = new Scanner(System.in);
        //find the largest number
        System.out.println("Enter the Number 1 : ");
        int N = sc.nextInt();
        System.out.println("Enter the Number 2 : ");
        int M = sc.nextInt();

        if (M>=N) {
            System.out.printf("M is the Largest number %d", +M);
        }
        else {
            System.out.printf("N is the Largest number %d",+N);
        }
        sc.close();

    }
}
