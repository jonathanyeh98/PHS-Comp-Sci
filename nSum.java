import java.util.Scanner;
/**
 * Jonathan Yeh
 * jy_nSum
 * 
 * Calculates the sum from 0 to N
 */
public class jy_nSum
{
    public static int sum (int n)
    {
        if(n == 0)
        {
            return n; //Final number
        }
        else
        {
            return n + sum(n-1); //Adds n to n-1 to n-2....
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        while(!done)
        {
            System.out.println("Sum of all integers from 0 to N. Choose N");
            int n = in.nextInt();
            System.out.println(sum(n));
            System.out.println("Done? 1) Y. 2) N.");
            int choice = in.nextInt();
            if(choice == 1)
            {
                done = true;
            }
        }
    }
}
