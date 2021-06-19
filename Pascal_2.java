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
    
    public int[] pascalline(int n) //First line of the pascal
    {
        int[] currline = {1};
        if (n == 1)
        {
            return currline; //If the line chosen was 1
        }
        else
        {
            return pascalline(n, currline); //If the line chosen was larger than 1
        }
    }
    
    public int[] pascalline(int n, int[] narr) //Every other line of the pascal
    {   
        //takes in an array so that comparisons can be made
        int[] currline = new int[narr.length + 1]; //creates an array that is the size of the corresponding line
        for(int i = 0 ; i <= narr.length ; i++)
        {
            if(i == 0)
            {
                currline[i] = 1; //First element is always 1
            }
            else if(i == narr.length)
            {
                currline[i] = 1; //Last element is always 1
            }
            else
            {
                currline[i] = narr[i-1] + narr[i]; //Every element in between
            }
        }
        if(currline.length == n)
        {
            return currline; //If the program reaches the desired line, return said line
        }
        else
        {
            return pascalline(n, currline); //If the program has not reached the desired line, continue
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