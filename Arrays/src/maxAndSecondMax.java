import java.util.ArrayList;
/*The task is to complete the function largestAndSecondLargest(), which should return
maximum and second maximum element from the array with first element as maximum element
and second element as second maximum(if there is no second maximum the  second element
should be -1)*/
public class maxAndSecondMax {
    public static ArrayList<Integer> largestAndSecondLargest(int n, int arr[])
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int max = -1;
        for(int i =0;i<n;i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        int secondMax = -1;
        for(int i=0;i<n;i++)
        {
            if(arr[i] < max && arr[i] > secondMax)
                secondMax = arr[i];

        }
        result.add(max);
        result.add(secondMax);
        return result;

    }
    public static void main(String[] args)
    {
        int arr[] = {2,2,2};
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<Integer>(2);
        result = largestAndSecondLargest(n,arr);
        System.out.print("Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.print("\nMax and Second Max : ");
        for(int i : result)
            System.out.print(i + " ");
    }
}
