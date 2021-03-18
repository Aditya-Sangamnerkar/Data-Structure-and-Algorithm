
/*find the frequency of all numbers in a sorted array*/
public class frequency {

    public static void printFrequency(int[] arr , int n )
    {
        int num = arr[0];
        int count = 1;
        System.out.println("\nFrequency of all elements:");
        for(int  i=1;i<n;i++)
        {
            if(arr[i] == num)
                count++;
            else
            {
                System.out.print(num+" : "+count+", ");
                num = arr[i];
                count = 1;
            }
        }
        System.out.print(num+" : "+count);
    }
    public static void main(String[] args)
    {
        int arr[] = {30,30,20,10,5,5,4};
        int n = arr.length;
        System.out.print("Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        printFrequency(arr,n);
    }


}
