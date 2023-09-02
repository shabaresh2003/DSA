// Finding n number of ways in nXm matrix
import java.util.Scanner;
class Numberofways
{
    public int count(int n , int m)
    {
        if(n==1|| n==2)
        {
            return 1;
        }
        return count(n-1,m)+count(n,m-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n and m");
        Numberofways l = new Numberofways();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p=l.count(n, m);
        System.out.println("The ways are : "+ p);
    }
}