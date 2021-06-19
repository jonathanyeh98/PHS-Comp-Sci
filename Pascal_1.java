import java.util.Scanner;
/**
 * Jonathan Yeh
 * jy_Pascal
 * 
 * returns a line of the pascal triangle that corresponds with user choice
 */
public class jy_Pascal
{
    private int[] pascal;
    public jy_Pascal()
    {
        
    }
    
    public int[] pascalline(int n)
    {
        int[] currline = {1};
        if (n == 1)
        {
            return currline;
        }
        else
        {
            return pascalline(n, currline);
        }
    }
    
    public int[] pascalline(int n, int[] narr)
    {   
        int[] currline = new int[narr.length + 1];
        for(int i = 0 ; i <= narr.length ; i++)
        {
            if(i == 0)
            {
                currline[i] = 1;
            }
            else if(i == narr.length)
            {
                currline[i] = 1;
            }
            else
            {
                currline[i] = narr[i-1] + narr[i];
            }
        }
        if(currline.length == n)
        {
            return currline;
        }
        else
        {
            return pascalline(n, currline);
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        jy_Pascal p = new jy_Pascal();
        
        boolean done = false;
        
        while(!done)
        {
            System.out.println("Choose which line of the pascal triangle starting with the first(1)");
            int lineChoice = in.nextInt();
            int[] line = p.pascalline(lineChoice);
        
            String s = "";
            for(int i = 0 ; i < line.length ; i++)
            {
                s += line[i] + ",";
            }
        
            System.out.println(s);
            System.out.println("Again? 1.) Yes  2.) No");
            int choice = in.nextInt();
            if (choice == 2)
            {
                done = true;
            }
        }
    }
}