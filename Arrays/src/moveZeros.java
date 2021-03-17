/*move all the zeros in the array at the end and preserve the order of non zero numbers */
public class moveZeros {


        public static void moveToEnd ( int arr[], int n)
        {
            int lastNonZeroIndex = 0;
            for (int i = 0; i < n; i++)
            {
                if(arr[i]!=0)
                {
                    if(lastNonZeroIndex!=i)
                    {
                        arr[lastNonZeroIndex] = arr[i];
                        arr[i] = 0;
                    }
                    lastNonZeroIndex++;
                }
            }
        }


        public static void main(String[] args)
        {
            int arr[] = {8,5,0,10,0,20,0,0,-3,4,0};
            int n = arr.length;
            System.out.print("Input Array :");
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
            moveToEnd(arr,n);
            System.out.print("\nOutput Array :");
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
        }
}
