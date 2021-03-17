/* left rotate an array by one position for all numbers in array*/
public class leftRotateBy1 {

    public static void leftRotate(int[] arr, int n)
    {
        int temp = arr[0];

        for(int i=1;i<n;i++)
        {
            arr[i-1]  = arr[i];
        }
        arr[n-1]=temp;

    }
    public static void main(String[] args)
    {
        int arr[] = {1,3,5,6};
        int n = arr.length;
        System.out.print("Input Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        leftRotate(arr,n);
        System.out.print("\nOutput Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }
}
