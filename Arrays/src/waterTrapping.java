/* find water trapped between the walls of height given in the array.*/

public class waterTrapping{

    public static int getWater(int arr[] , int n )
    {
        int lMax[] = new int[n];
        int rMax[] = new int[n];
        lMax[0] = arr[0];
        int water = 0;
        for(int i=1;i<n;i++)
            lMax[i] = Math.max(arr[i],lMax[i-1]);

        rMax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
            rMax[i] = Math.max(arr[i],rMax[i+1]);

        for(int i=0;i<n;i++)
            water+=Math.min(lMax[i],rMax[i]) - arr[i];
        return water;
    }

    public static void main(String[] args)
    {
        int arr[] = { 3,0,1,2,5};
        int n = arr.length;
        System.out.print("Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println("\nWater trapped : "+getWater(arr,n));
    }
}