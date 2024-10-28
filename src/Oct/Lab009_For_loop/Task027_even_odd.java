package Oct.Lab009_For_loop;

public class Task027_even_odd
{
    public static void main(String[] args) {
        // Shruti - TO find the even numbers from 1 to 50
        
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }

        }
    }
}
