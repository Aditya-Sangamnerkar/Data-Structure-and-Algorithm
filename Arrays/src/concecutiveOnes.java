/*Find count of maximum consecutive 1s in a binary array.*/
public class concecutiveOnes {

    public static int maxConcecutiveOnes(int arr[] , int n)
    {
        int currentMax = 0;
        int maximum = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 1)
                currentMax++;
            else
            {
                maximum = Math.max(currentMax,maximum);
                currentMax = 0;
            }
        }
        maximum = Math.max(currentMax,maximum);
        return maximum;

    }
    public static void main(String[] args)
    {
        int arr[] = {1,0,1,1,1,1,0,1,1};
        int n = arr.length;
        System.out.print("Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println("\nMaximum concecutive ones : "+maxConcecutiveOnes(arr,n));
    }
}
