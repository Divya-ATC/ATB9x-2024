package Oct.Lab003;

public class Task004
{
    public static void main(String[] args)
    {
        int a =10;
        //System.out.printf("The value of a is %d",++a + a-- + a++);
        // ++a -> 11 ->11
        //a-- -> 11 -> 10
        //a++ -> 10 ->11
        System.out.printf("The value of a is %d ",a++ + a-- + a++);
        //a++ ->10 ->11
        //a-- ->11->10
        //a++ ->10 ->11
        System.out.printf("the value of the a is %d ",a++ + ++a + a--);
        //a++ -> 11 ->12
        //++a->13 ->13
        //a-- ->13 ->12
    }
}


