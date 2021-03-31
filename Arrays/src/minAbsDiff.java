/*Given an array Arr of n integers
arranged in a circular fashion. Your task is to
find the minimum absolute difference between adjacent elements.*/
public class minAbsDiff {

        public static int minDiff(int arr[], int n)
        {
            int minDiff = Math.abs(arr[n-1] - arr[0]);
            for(int i=1;i<n;i++)
            {
                int currDiff = Math.abs(arr[i-1] - arr[i]);
                if(currDiff < minDiff)
                    minDiff = currDiff;
            }
            return minDiff;
        }
        public static void main(String[] args)
        {
            int arr[] = {8,-8,9,-9,10,-11,12};
            int n = arr.length;
            System.out.print("Array :");
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
            System.out.println("\nMinimum absolute adjcent difference : "+minDiff(arr,n));
        }
}

