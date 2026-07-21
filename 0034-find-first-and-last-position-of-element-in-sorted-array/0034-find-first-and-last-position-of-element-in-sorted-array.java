class Solution {
    public int[] searchRange(int[] a, int t) {
        
        int ans[] = new int[]{-1,-1};

        int l=0;
        int h = a.length-1;

        while(l<=h)
        {
            int mid = l+(h-l)/2;

            if(a[mid]==t)
            {
                ans[0] = mid;
                h = mid-1;
            }
            else if(a[mid]<t)
            {
                l=mid+1;
            }
            else
            {
                h = mid-1;
            }
            
        }

        l=0;
        h = a.length-1;

        while(l<=h)
        {
            int mid = l+(h-l)/2;

            if(a[mid]==t)
            {
                ans[1] = mid;
                l=mid+1;
            }
            else if(a[mid]<t)
            {
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