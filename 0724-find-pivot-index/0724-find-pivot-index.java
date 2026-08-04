class Solution {
    public int pivotIndex(int[] a) {
        
        int n = a.length;

        int ps[] = new int[n];
        int ss[] = new int[n];

        ps[0] = a[0];
        ss[n-1] = a[n-1];

        for(int i=1;i<n;i++)
        {
            ps[i] = ps[i-1]+a[i];
        }
        for(int i=n-2;i>=0;i--)
        {
            ss[i] = ss[i+1] + a[i];
        }

        int i=0;
        int j=0;

        while(i<n && j<n)
        {
            if(ps[i]==ss[j])
            {
                return i;
            }
            i++;
            j++;
        }
        return -1;

    }
}