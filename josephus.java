import java.util.Scanner;
class Josephus
{
    public int Freedom(int n , int k)
    
    {
        if(n==1)
        return 0;
        return (Freedom(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n and k");
        Josephus l = new Josephus();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p=l.Freedom(n, k);
        System.out.println("The person is "+ p);
    }
}
