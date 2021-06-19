import java.util.Scanner;
import java.util.ArrayList;
/**
 * Jonathan Yeh
 * jy_StringFinder
 * 
 * Searches for a string in a sorted array of strings. Sorts class from ch 6 is used
 */
public class jy_StringFinder
{
    public static int comps = 0;
    public static boolean search(String[] sArray , String target , int depth)
    {
        if(depth == sArray.length)
        {
            return false;
        }
        comps++;
        if(sArray[depth].equals(target))
        {
            return true;
        }
        return search(sArray ,target , depth + 1);
    }
    
    public static void main(String[] args)
    {
        ArrayList<String> sArrList = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        boolean doneAdding = false;
        while(!doneAdding)
        {
            System.out.println("Enter string to array list: ");
            String temp = in.nextLine();
            sArrList.add(temp);
            System.out.println("Add another? 1) Yes ; 2) No");
            int choice = in.nextInt();
            if(choice == 2)
            {
                doneAdding = true;
            }
            in.nextLine();
        }
        
        String[] s = new String[sArrList.size()];
        for(int i = 0 ; i < sArrList.size() ; i++)
        {
            s[i] = sArrList.get(i);
        }
        
        Sorts.insertionSort(s);
        
        System.out.println("Enter target string: ");
        String target = in.nextLine();
        boolean inList = search(s, target, 0);
        System.out.println("Total Strings: "+ s.length);
        System.out.println("Comparisons: " + comps);
        if(inList)
        {
            System.out.println("The target is in the list.");
        }
        else
        {
            System.out.println("The target is not in the list.");
        }
    }
}