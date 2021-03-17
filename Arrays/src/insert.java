
/*inset a number x at the given position in an array that has size = capacity and is currently filled with n numbers*/
public class insert {

    public static int insertAtPos(int arr[] ,int n , int x ,int capacity ,int position)
    {
        if(n == capacity)
            return n;

        int index = position - 1;
        for(int i = n ;i> index ;i--)
            arr[i] = arr[i-1];
        arr[index] = x;
        return n+1;
    }
    public static void main(String[] args)
    {
        int arr[] = new int[8];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 1;
        arr[3] = 6;
        int n = 4;
        System.out.println("Array :");
        for(int i =0;i<n;i++)
            System.out.print(arr[i]+" ");

        n = insertAtPos(arr,4,5,arr.length,2);
        System.out.println("\nArray :");
        for(int i =0;i<n;i++)
            System.out.print(arr[i]+" ");

    }
}
