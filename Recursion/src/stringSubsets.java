import java.util.Scanner;

public class stringSubsets {

    public static void generateSubsets(String str , int index , String cur)
    {
        if(index == str.length()) {
            System.out.println(cur + " ");
            return;
        }

        generateSubsets(str,index + 1 ,cur);
        generateSubsets(str, index +1,cur+str.charAt(index));

    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = in.nextLine();
        stringSubsets.generateSubsets(str,0," ");
    }
}
