package Oct.Lab007_Condition_Loops;
import java.util.*;
public class Task021_grade_calculator
{
    // ✅ Grade Calculator:
    // Write a program that calculates and displays the letter grade
    // for a given numerical score (e.g., A, B, C, D, or F)
    // based on the following grading scale:
    //
    //A: 90-100
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: 0-59

    // Logic Building - Java
    public static void main(String[] args) {


        // Step 1
        // Find the inputs / outputs
        // Input | score -> (0 - 100) -> data type -> int
        // Output | grade -> data type -> char
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score to get the grade");
        int score = sc.nextInt();

        // 2. Basic Logic |  Rough Logic
        // if ( score >= 90 && score <= 100 ) -> return or print grade - A
        // else if score <=89 && score >= 80 -> return or print grade - B
        // else if score <=79 && score >= 70 -> return or print grade - C
        // D,E
        //  // else -> grade -> F
        if(score>=90 && score<=100)
        {
            System.out.println("Grade - A");
        }
        else if(score<=89 && score >=80)
        {
            System.out.println("Grade - B");
        }
        else if(score<=79 && score >=70)
        {
            System.out.println("Grade - C");
        }
        else if(score<=69 && score >=60)
        {
            System.out.println("Grade - D");
        }
        else if(score<=59 && score >=50)
        {
            System.out.println("Grade - E");
        }
        else
        {
            System.out.println("Fail");
        }
        sc.close();

    }
}
