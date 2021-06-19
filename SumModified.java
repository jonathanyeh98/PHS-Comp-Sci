import java.util.Scanner;
/**
 * Jonathan Yeh
 * jy_SumModified
 * 
 * the sum is the sum of 1 to n/2 and n/2 + 1 to n
 */

public class jy_SumModified
{
    public static int sumCalc(int n , int init)
    {
        if(n == init)
        {
            return n;
        }
        return sumCalc((n+init)/2 , init) + sumCalc(n , ((n+init)/2)+1);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean cont = true;
        while(cont)
        {
            System.out.println("Sum of 1 to N. Choose N");
            int n = in.nextInt();
            System.out.println(sumCalc(n,1));
            System.out.println("Again? 1)Yes 2)No");
            int choice = in.nextInt();
            if(choice == 2)
            {
                cont = false;
            }
        }
    }
}