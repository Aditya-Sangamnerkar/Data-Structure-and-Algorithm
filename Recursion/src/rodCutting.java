
/* given a rope of length n , you need to find max number of pieces you can make
such that length of every piece is in set {a,b,c}
*/

public class rodCutting {

    public static int maxCuts(int n , int a , int b , int c)
    {
        if(n == 0 )
            return 0;
        if(n <  0)
            return -1;
        int res =  Math.max(maxCuts(n-a,a,b,c),Math.max(maxCuts(n-b,a,b,c),maxCuts(n-c,a,b,c)));
        if(res == -1)
            return -1;
        return res + 1;
    }
    public static void main(String[] args)
    {
        System.out.println(rodCutting.maxCuts(5,2,5,1));
    }
}
