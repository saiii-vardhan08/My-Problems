class Solution {
    public int search(int[] a, int t) {
        
        int l=0;
        int h = a.length-1;

        while(l<=h)
        {
            int mid = l+(h-l)/2;

            if(a[mid]==t)
            {
                return mid;
            }
            else if(a[l]<=a[mid])
            {
                if(a[l]<=t && t<a[mid])
                {
                    h = mid-1;
                }
                else
                {
                    l = mid+1;
                }
            }
            else
            {
                 if(a[mid]<t && t<=a[h])
                {
                    l=mid+1;
                }
                else
                {
                    h = mid-1;
                }
            }
        }

        return -1;
    }
}