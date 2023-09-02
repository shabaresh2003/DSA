class subarraySum
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int currsum = 0;
        int start = 0;
        int end = -1;
        HashMap<Integer,Integer> hp = new HashMap<>();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            currsum = currsum +arr[i];
            if(currsum-s ==0)
            {
                start = 1;
                end = i+1;
                break;
            }
            if(hp.containsKey(currsum - s))
            {
                start = hp.get(currsum -s)+2;
                end = i+1;
                break;
            }
            hp.put(currsum,i);
        }
        if(end == -1)
        {
            ar.add(end);
            return ar;
        }
        ar.add(start);
        ar.add(end);
        return ar;
    }
}