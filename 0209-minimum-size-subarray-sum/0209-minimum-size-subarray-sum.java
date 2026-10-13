class Solution {
    public int minSubArrayLen(int t, int[] a) {
        
        int l=0;
        int r=0;
        int s=0;
        int ans = Integer.MAX_VALUE;

        while(r < a.length)
        {
            s+=a[r];

            while(s >= t)
            {
                ans = Math.min(ans,r-l+1);
                s-=a[l];
                l++;
            }
            r++;
        }

        return ans==Integer.MAX_VALUE ? 0 : ans;
    }
}