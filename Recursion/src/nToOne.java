public class nToOne {

    public static void printNto1(int n)
    {
        if(n == 0)
            return;

        System.out.println(n);
        printNto1(n-1);


    }


    public static void main(String[] args)
    {
            nToOne.printNto1(5);
    }

}
