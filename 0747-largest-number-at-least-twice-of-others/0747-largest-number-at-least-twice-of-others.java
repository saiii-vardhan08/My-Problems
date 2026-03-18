class Solution {
    public int dominantIndex(int[] a) {
        
        int n = a.length;
        int ind = 0;
        boolean b = false;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
                ind = i;
            }
        }

        for(int i=0;i<n;i++)
        {
            if(i==ind)
            {
                continue;
            }
            else
            {
                if(2*a[i]>max)
                {
                    b=true;

                    break;
                }
            }
        }
        if(b)
        {
            return -1;
        }
        else
        {
            return ind;
        }
       





        
    }
}