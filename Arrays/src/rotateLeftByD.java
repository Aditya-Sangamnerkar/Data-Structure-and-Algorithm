/*Rotate an array elements by d spaces*/

public class rotateLeftByD {

    public static void reverse(int[] arr, int start , int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateLeft(int[] arr, int n, int d)
    {
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int d = 2;
        System.out.print("Input Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println("\nd : "+d);
        rotateLeft(arr,n,d);
        System.out.print("Output Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");


    }
}
