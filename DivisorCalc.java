import java.util.Scanner;
/**
 * Jonathan Yeh
 * jy_DivisorCalc
 * 
 * Finds the greatest common denominator between two numbers
 */
public class jy_DivisorCalc
{
    public static int gdc(int num1 , int num2)
    {
        if(num1 < num2)
        {
            return gdc(num2 , num1);
        }
        else
        {
            if((num1 % num2) == 0)
            {
                return num2;
            }
            else
            {
                return gdc(num1 , num1%num2);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean stillgoing = true;
        while(stillgoing)
        {
            System.out.println("Choose first number: ");
            int num1 = in.nextInt();
            System.out.println("Choose second number: ");
            int num2 = in.nextInt();
            System.out.println("GDC: " + gdc(num1 , num2));
            System.out.println("Continue? 1) Yes 2)No");
            int choice = in.nextInt();
            if(choice == 2)
            {
                stillgoing = false;
            }
        }
    }
}