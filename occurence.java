import java.util.Scanner;
public class Occurence 
{
    public static int first = -1;
    public static int last = -1;
    public static void FindOcuur(String str , int idx , char el)
    {
        if(idx == str.length())
        {
            System.out.println("First "+ first);
            System.out.println("Last "+last );
            return ;
        }
        char currchar = str.charAt(idx);
        if(currchar==el)
        {
            if(first == -1)
            {
                first = idx;
            }
            else
            {
                last = idx;
            }
        }
        FindOcuur(str,idx +1 ,el);
    
    }
    public static void main(String args[])
    {
       
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        System.out.println("Enter the character");
       
        FindOcuur(str,0,'s');
    }
}