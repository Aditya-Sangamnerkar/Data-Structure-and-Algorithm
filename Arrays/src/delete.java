public class delete {

    public static int deleteFromPos(int[] arr, int n , int x)
    {
        int i;
        for(i=0;i<n;i++)
            if(arr[i] == x)
                break;
        if(i == n)
            return n;

        if(i == n-1)
            return --n;

        for(int j =i;j<n-1;j++)
            arr[j] =arr[j+1];

        return --n;
    }

    public static void main(String[] args)
    {
        int arr[] = {1,3,5,7,9};
        System.out.print("Input Array : ");
        int n = arr.length;
        int x = 5;
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println("\nx : "+x);
        n = deleteFromPos(arr,n,x);
        System.out.print("Output Array :");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");


    }
}
