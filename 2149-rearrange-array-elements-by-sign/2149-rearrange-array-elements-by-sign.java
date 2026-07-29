class Solution {
    public int[] rearrangeArray(int[] a) {
        
        int n = a.length;

        int ans[] = new int[n];

        int p=0;
        int ni=1;

        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                ans[p]= a[i];
                p+=2;
            }
            else
            {
                ans[ni]=a[i];
                ni+=2;
            }
        }
        
        

        return ans;
    }
}