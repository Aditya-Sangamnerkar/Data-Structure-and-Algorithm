import java.util.ArrayList;
import java.util.Collections;
/* maximum sum subarray */

public class maxSumSubarray{

    public static int maxSum(int arr[] ,int n)
    {
        int maximum = arr[0];
        int current = arr[0];

        for(int i =1;i<n;i++)
        {
           current = Math.max(arr[i]+current, arr[i]);
           maximum = Math.max(current,maximum);


        }
        return maximum;

    }

    public static void main(String[] args)
    {
        int arr[] = {-3,8,-2,4,-5,6};
        int n = arr.length;
        System.out.print("Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println("\nMaximum sum : "+maxSum(arr,n));
    }
}
