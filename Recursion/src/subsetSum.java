import java.util.ArrayList;

public class subsetSum {

    public static int countSubsets(int[] arr , int index , ArrayList<Integer> curr , int sum)
    {
        if(index == arr.length)
        {
            int sum1 = 0;
            for(int i : curr)
                sum1+=i;
            if(sum1 == sum)
                return 1;
            else
                return 0;
        }
        int r1 =  countSubsets(arr,index+1,curr,sum) ;
        curr.add(arr[index]);
        int r2 = countSubsets(arr,index+1,curr,sum);
        return r1 + r2;
    }


    public static void main(String[] args)
    {
        int[] arr = {1,2};
        ArrayList<Integer> curr = new ArrayList<Integer>();

        System.out.println(subsetSum.countSubsets(arr,0,curr,3));
    }
}
