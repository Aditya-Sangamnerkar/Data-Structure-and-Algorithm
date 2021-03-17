/*Search the given number in the array*/
public class search {

    public static int linearSearch(int[] arr , int n , int x)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40};
        int n = arr.length;
        int x = 20;
        System.out.print("Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println("\nx : "+x);
        System.out.println("found at " +linearSearch(arr,n,x));

    }
}
