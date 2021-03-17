/* Remove duplicate numbers from a sorted array*/
public class removeDuplicates {

    public static int remove(int[] arr,int n)
    {
        int result = 1;
        for(int i =1;i<n;i++)
        {
            if(arr[i]!=arr[result-1])
            {
                arr[result] = arr[i];
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,2,3,3,3};
        int n = arr.length;

        System.out.print("Input Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

        n = remove(arr,n);

        System.out.print("\nOutput Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }

}
