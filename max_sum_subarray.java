import java.util.*;
import java.lang.*;
public class max_sum_subarray
{
    public static void kadanes(int num[])//we use the kadanes algorithm as it has good time complexity
    {
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for(int i=0;i<num.length;i++)
        {
            cs=cs+num[i];
            if(cs<0)
            {cs=0;                
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Our max subarray sum is : "+ ms);

    }
    public static void main(String args[])
    {
        int num[]={-2, -3, 4, -1, -2, 1,5, -3};
        kadanes(num);

    }

}