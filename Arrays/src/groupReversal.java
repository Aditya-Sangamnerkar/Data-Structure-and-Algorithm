import java.util.ArrayList;
import java.util.Arrays;

/*You don't need to read input or print anything. The task is to
complete the function reverseInGroups() which takes the array, N and K
as input parameters and modifies the array in-place. */

public class groupReversal {
    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {

        for(int i =0;i<n;i+=k)
        {
            if((i+k-1) < n)
                reverse(arr,i,i+k-1);
            else
                reverse(arr,i,n-1);
        }
    }
    public static void reverse(ArrayList<Integer> arr , int start , int end)
    {
            while(start<end)
            {
                int temp = arr.get(start);
                arr.set(start, arr.get(end));
                arr.set(end , temp);
                start++;
                end--;
            }
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> arr =  new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        int n = arr.toArray().length;
        int k = 3;
        System.out.print("Input Array : ");
        for(int i : arr)
            System.out.print(i+" ");
        System.out.println("\nk : "+k);
        reverseInGroups(arr,n,k);
        System.out.print("Output Array : ");
        for(int i : arr)
            System.out.print(i+" ");

    }
}
