public class strongestNeighbour {

    public static void maximumAdjacent(int sizeOfArray, int arr[]){
        System.out.print("\nStrongest Neighbours : ");
        for(int i =0;i<sizeOfArray-1;i++)
        {
            int max = (arr[i] >arr[i+1])? arr[i] : arr[i+1];
            System.out.print(max+" ");
        }

    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,2,3,4};
        int n = arr.length;
        System.out.print("Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        maximumAdjacent(n,arr);

    }
}
