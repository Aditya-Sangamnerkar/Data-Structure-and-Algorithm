import java.util.Scanner;


public class palindrome {

    public static boolean checkPalindrome(String str , int start , int end)
    {
        if(start == end)
            return true;
        if(start - end == 1)
            return true;
        return ( str.charAt(start) == str.charAt(end)) && checkPalindrome(str,start+1,end-1);
    }


    public static void main(String[] args)
    {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a string : ");
            String str = in.nextLine();
            System.out.println(checkPalindrome(str,0,str.length()-1));

    }
}
