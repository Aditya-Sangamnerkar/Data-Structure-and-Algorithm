/*find the length of the longest subarray that has alternating even odd elements.*/
public class maxEvenOdd {

    public static int maxLength(int arr[] , int n)
    {
        int max_length = 1;
        int cur_length = 1;
        int flag = (arr[0]%2==0)?1:0;
        for(int i =1;i<n;i++)
        {
            if(arr[i]%2==0 && flag == 0)
            {
                cur_length++;
                flag = 1;
            }
            else if(arr[i]%2!=0 && flag == 1)
            {
                cur_length++;
                flag = 0;
            }
            else
            {   cur_length = 1;
                flag = (arr[i]%2==0)?1:0;
            }
            max_length = Math.max(max_length,cur_length);
        }
        return max_length;
    }
    public static void main(String[] args)
    {
        int arr[] ={10,12,14,7,8};
        //int arr[] = {7,10,13,14};
        //int arr[] = {10,12,8,4};
        int n = arr.length;
        System.out.print("Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

        System.out.println("\nMaximum even odd subarray length : "+maxLength(arr,n));
    }
}
