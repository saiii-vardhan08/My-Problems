class Solution {
    public int searchInsert(int[] a, int t) {
        
        int l = 0;
        int h = a.length-1;
        int ans = 0;

        while(l<=h)
        {
            int mid = l+(h-l)/2;

            if(a[mid]==t)
            {
                ans = mid;
                return ans;
            }
            else if(a[mid]<t)
            {
                ans = mid + 1;
                l = mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        return ans;
    }
}