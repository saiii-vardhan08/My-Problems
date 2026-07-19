class Solution {
    public int minSubArrayLen(int t, int[] a) {
        
        int r=0;
        int l=0;
        int ml = Integer.MAX_VALUE;
        boolean f = false;
        int s = 0;
        while(r<a.length)
        {
            s+=a[r];

            while(s>=t)
            {
                ml = Math.min(ml,r-l+1);
                f= true;
                s-=a[l];
                l++;
            }
            
            r++;
        }

    if(f)
    {
        return ml;
    }
    else
    {
        return 0;
    }
    }
}