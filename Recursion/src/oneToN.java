public class oneToN {

    public static void print1ToN(int n ,int k)
    {
        if(n==0)
            return;

        System.out.println(k);
        print1ToN(n-1,k+1);
    }

    public static void main(String[] args)
    {
        oneToN.print1ToN(5,1);
    }

}
