class Solution {
    public int[] rearrangeArray(int[] a) {
        
        int n = a.length;

        int p[] = new int[n/2];
        int na[] = new int[n/2];

        int j=0;
        int k=0;

        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                p[j] = a[i];
                j++;
            }
            else
            {
                na[k] = a[i];
                k++;
            }
        }

        int ans[] = new int[n];

        j=0;
        k=0;

        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                ans[i] = p[j];
                j++;
            }
            else
            {
                ans[i] = na[k];
                k++;
            }
        }

        return ans;
    }
}