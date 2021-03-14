
/*You are given a number n. You need to find the digital root of n.
 DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.*/


public class digitalRoot {

    public static int digitalRoot(int n)
    {

        if(n < 10)
            return n;

        int sum = n%10 + digitalRoot(n/10);

        while(sum > 9)
        {
            sum = sum%10 +digitalRoot(sum/10);
        }

        return sum;

    }

    public static void main(String[] args)
    {
        System.out.print(digitalRoot(999));
    }
}
