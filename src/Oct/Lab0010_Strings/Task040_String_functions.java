package Oct.Lab0010_Strings;

public class Task040_String_functions
{
    public static void main(String[] args)
    {
        String anotherPalindrome = "hamburger";
        String abc =  anotherPalindrome.substring(1,5);
        System.out.println(abc);

        //Concatenation
        String S1 = "Hello";
        String S2 =S1.concat("World");
        System.out.println(S2);

        //Split
        String Sp1 = "hamburger-Icecream-Fries";
        String[] Sp2 =  Sp1.split("-");
        System.out.println(Sp2[0]);
        System.out.println(Sp2[1]);
        System.out.println(Sp2[2]);

        //Charat
        String Sc = "Hello";
        System.out.println(Sc.charAt(2));

        //index of - Return the index of the character

        //Contains - Return true if the charater is present else false
        String Sp = "Hello";
        System.out.println(Sp.contains("e"));
        //last index of - last occurrence of char value

        //replace
        String Sm = "banana";
        System.out.println(Sm.replace("a","0"));

        //Starts with
        String St = "Hello";
        System.out.println(St.startsWith("H"));

        //Ends with
        System.out.println(St.endsWith("o"));

        //Replace All
        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "-");
        System.out.println(result2);
        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3);





    }
}
