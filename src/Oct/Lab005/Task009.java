package Oct.Lab005;
import java.util.Scanner;

public class Task009
{
    public static void main(String[] argc)
    {
        //Find the grade as per the score
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your score:");
        int score = sc.nextInt();

        if (score <= 100 && score >= 85) {
            System.out.println("Your Grade is A");
        }
        else if (score <= 84 && score >= 70){
            System.out.println("Your Grade is B");
        }
        else if (score <= 69 && score >= 55){
            System.out.println("Your Grade is C");
        }
        else if (score <= 55 && score >= 45){
            System.out.println("Your Grade is D");
        }
        else {
            System.out.println("Your Grade is E");
        }
        sc.close();
    }
}
