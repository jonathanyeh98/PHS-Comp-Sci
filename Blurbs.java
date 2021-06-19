import java.util.Scanner;
import java.lang.Math;
/**
 * Jonathan Yeh
 * Blurbs
 * 
 * Creates a randomly generated blurb of a certain length. Whoozits are limited to only 10 in length
 */
public class Blurbs
{   
    //Creates a whoozit. whoosit is a string starting with an x followed by 0 or more y's
    public static String makeWho(int whoLength, int whoPos)
    {
        if(whoPos == 0)
        {
            return "x" + makeWho(whoLength , whoPos + 1);
        }
        else if(whoPos == whoLength)
        {
            return " ";
        }
        else
        {
            return "y" + makeWho(whoLength , whoPos + 1);
        }
    }
    
    //Creates a whatzit. a string starting with a q followed by z or d, then followed by a whoozit
    public static String makeWha(int whaType)
    {
        if(whaType == 1)
        {
            return "qz " + makeWho((int) (Math.random() * 10) + 1 , 0);
        }
        else
        {
            return "qd " + makeWho((int) (Math.random() * 10) + 1 , 0);
        }
    }
    
    //Creates a blurb. a string starting with a whoozit followed by 1 or more whatzits
    public static String makeBlurb(int blurbLength, int blurbPos)
    {
        if(blurbLength == blurbPos)
        {
            return makeWha((int) (Math.random()*2));
        }
        else if(blurbPos == 0)
        {
            return makeWho((int) (Math.random()*10)+1 , 0) + makeBlurb(blurbLength , blurbPos + 1);
        }
        else
        {
            return makeWha((int) (Math.random()*2)) + makeBlurb(blurbLength , blurbPos + 1);
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        while(!done)
        {
            System.out.println("Desired blurb length: ");
            int l = in.nextInt();
            System.out.println(makeBlurb(l , 0));
            System.out.println("done? 1)yes ; 2)no");
            int choice = in.nextInt();
            if(choice == 1)
            {
                done = true;
            }
        }
    }
}