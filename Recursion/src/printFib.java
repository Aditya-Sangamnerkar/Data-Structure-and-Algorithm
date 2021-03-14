/*You are given a number n. You need to find nth Fibonacci number.
F(n)=F(n-1)+F(n-2); where F(1)=1 and F(2)=1*/

public class printFib {
    static long fibonacci(int n)
    {
        if(n == 1)
            return 1;

        if(n == 2)
            return 1;

        return  fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args)
    {
        System.out.println(printFib.fibonacci(20));
    }
}
