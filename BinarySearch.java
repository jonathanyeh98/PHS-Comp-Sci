import java.util.Scanner;
import java.util.ArrayList;
/**
 * Jonathan Yeh
 * BinarySearch
 * 
 * Does a binary search for the target Comparable object(in the main it is integers). Sorted array needed.
 */

public class BinarySearch
{
    public static boolean search(Comparable[] c, Comparable target, int start , int end)
    {
        int mid = (start + end)/2; //finds the middle number
        if(target.compareTo(c[mid]) != 0)
        {
            if(target.compareTo(c[mid]) > 0)
            {
                if(mid == end)
                {
                    return false;
                }
                else
                {
                    return search(c , target, mid + 1, end);
                }
            }
            else
            {
                if(mid == start)
                {
                    return false;
                }
                else
                {
                    return search(c , target, start, mid);
                }
            }
        } 
        else
        {
            return true;
        }
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers to be in the array");
        boolean done = false;
        for(int i = 0; i < 10 ; i++)
        {
            int n = in.nextInt();
            ints.add(n);
        }
        
        Comparable[] integerArray = new Comparable[ints.size()];
        for(int i = 0 ; i < ints.size() ; i++){
            integerArray[i] = ints.get(i);
        }
        
        Sorts.insertionSort(integerArray);
        
        while(!done)
        {
            System.out.println();
            System.out.println("What number do you want to find?");
            int target = in.nextInt();
            System.out.println("Is the target in the array: " + search(integerArray , target, 0, integerArray.length - 1));
            System.out.println("Find another? 1) Yes 2) No");
            int choice = in.nextInt();
            if(choice == 2)
            {
                done = true;
            }
        }
    }
}