
/*reverse an array without using a duplicate array*/
public class reverse {

    public static void rev(int arr[],int n)
    {
        int start = 0;
        int end = n-1;
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = { 1,2,-3,4,0,6};
        int n = arr.length;
        System.out.print("Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        rev(arr,n);
        System.out.print("\nReversed Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }
}
