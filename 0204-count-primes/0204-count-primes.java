class Solution {
    public int countPrimes(int n) {
        
        if(n==0) return 0;
        if(n==1) return 0;
        int b[] =  sieve(n);
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(b[i]==1)
            {
                c++;
            }
        }
        return c;
    }
    public int[] sieve(int n)
    {
        int a[] = new int[n];

        Arrays.fill(a,1);
        
        a[0] = 0;
        a[1] = 0;
        for(int i=2;i*i<n;i++)
        {
            if(a[i]==1)
            {
                for(int j=i*i;j<n;j+=i)
                {
                    a[j]=0;
                }
            }
        }

        return a;
    }
}