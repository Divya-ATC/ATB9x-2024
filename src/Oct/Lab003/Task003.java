package Oct.Lab003;

public class Task003
{
    public static void main(String[] args)
    {
        // find the maximum values using the turnary operator
        int a = 50;
        int b = 60;
        int c = 30;
        int max ;
        max = (a>b)?(a>c?a:c):(b>c?b:c) ;
        System.out.printf("The maximum value is %d",max);

    }
}
