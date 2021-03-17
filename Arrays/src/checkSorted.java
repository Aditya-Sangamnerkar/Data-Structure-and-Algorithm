/*Check if an array is sorted in an non decreasing order*/
public class checkSorted {

    public static boolean check(int[] arr,int n)
    {
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;

    }

    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,6,7};
        int n = arr.length;
        System.out.println("Array : ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
        System.out.println("\nIs Sorted : "+ check(arr,n));
    }
}
