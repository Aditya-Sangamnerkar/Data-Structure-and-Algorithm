public class sumOfDigits {

    public static int printSum(int n)
    {
        if( n == 0)
            return 0;
        return  n%10 + printSum(n/10);
    }

    public static void main(String[] args)
    {
        int n = 25;
        int sum = sumOfDigits.printSum(n);
        System.out.print("For "+n+" sum of digits is "+sum);
    }
}
