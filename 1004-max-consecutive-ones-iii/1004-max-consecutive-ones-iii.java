class Solution {
    public int longestOnes(int[] a, int k) {

        int l=0;
        int r=0;
        int ans = Integer.MIN_VALUE;
        int oc=0;
        while(r<a.length)
        {
            if(a[r]==1) oc++;
            
            while((r-l+1) - oc > k)
            {
                 if(a[l]==1) oc--;
                l++;
            }
            ans = Math.max(ans,(r-l+1));
            r++;
        }
        return ans;
    }
}