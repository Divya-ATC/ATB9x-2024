package Oct.Lab005;
import java.util.Scanner;
public class Task010
{
    public static void main(String[] argc)
    {
        Scanner sc = new Scanner(System.in);
        //Equilateral Triangle: A triangle is said to be equilateral triangle if all the sides are equal.
        // If X, Y, Z are three sides of the triangle.Then, the triangle is equilateral only if X = Y = Z.

        //Isosceles Triangle: A triangle is said to be an isosceles triangle if any of its two sides are equal.
        // If X, Y, Z are three sides of the triangle.Then, the triangle is isosceles if either X = Y or X = Z or Y = Z.

        //Scalene Triangle: A triangle is said Scalene Triangle if none of its sides is equal.
        System.out.println("Enter side of Triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c){
            System.out.println("The Triangle is Equilateral");
        }
        else if ((a == b) || (b ==c ) || ( c==a )){
            System.out.println("The Triangle is Isosceles ");
        }
        else {
            System.out.println("The Triangle is Scalene");
        }

        sc.close();

    }
}
