public class josephusProblem {

    public static int jor(int n , int k)
    {
        if( n == 1)
            return 0;
        else
            return (jor(n-1,k)+k)%n;
    }

    public static void main(String[] args)
    {
        System.out.println(josephusProblem.jor(5,3));
    }
}
