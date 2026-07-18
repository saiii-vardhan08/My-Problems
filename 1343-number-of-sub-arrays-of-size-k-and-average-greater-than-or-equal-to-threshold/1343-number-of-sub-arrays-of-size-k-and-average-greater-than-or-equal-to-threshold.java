class Solution {
    public int numOfSubarrays(int[] a, int k, int t) {
        
        int c=0;
        int s=0;

        for(int i=0;i<k;i++)
        {
            s+=a[i];
        }

        if((double)s / k >= t)
        {
            c++;
        }

        for(int i=1;i<=a.length-k;i++)
        {
            s = s+ a[i+k-1] -a[i-1];

            if((double)s / k >= t)
            {
                c++;
            }
        }

        return c;
    }
}