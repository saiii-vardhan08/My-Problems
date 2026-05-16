class Solution {
    public int maxArea(int[] a) {
        int ma=0;
        int l=0;
        int r=a.length-1;
        while(l<r)
        {
            int h = Math.min(a[l],a[r]);
            int w = r-l;

            int area = h * w;

            ma = Math.max(ma,area);

            if(a[l]<=a[r])
            {
                l++;
            }
            else
            {
                r--;
            }

        
        }
        return ma;
    }
}