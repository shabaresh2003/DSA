class  TowersofHanoii
{
    public void Tower(int n , char src , char helper , char dest)
    {
        if(n==1)
        {
            System.out.println("Transfer disk "+ n + "From Source"+ src+ " to destination "+dest);
            return;
        }
        Tower(n-1,src,dest,helper);
        System.out.println("Transfer disk "+ n + "From Source"+ src+ " to destination "+dest);
        Tower(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        int n = 3;
        TowersofHanoii tc = new TowersofHanoii();
        tc.Tower(n,'A','B','c');
    }


}
