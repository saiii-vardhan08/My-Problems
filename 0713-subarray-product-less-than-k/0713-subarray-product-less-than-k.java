class Solution {
    public int numSubarrayProductLessThanK(int[] a, int k) {
        if(k<=1) return 0;
        int l=0;
        int r=0;
        long p = 1;
        int cs =0;
        while(r<a.length)
        {
            p = p*a[r];

            while(p >= k)
            {
                p = p/(long)a[l];

                l++;

            }
            cs+=(r-l+1);
            r++;
        }
        return cs;
    }
}