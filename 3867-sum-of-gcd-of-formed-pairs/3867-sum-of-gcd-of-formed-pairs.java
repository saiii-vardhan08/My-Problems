class Solution {
    public long gcdSum(int[] a) {

        int v[] = a;
        int al = v.length;
        
        long b[] = new long[al];

        
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<al;i++)
            {
                if(v[i]>max)
                {
                    max = v[i];
                }  
                b[i] = GCD(v[i],max);
            }
        
        Arrays.sort(b);
        int bl = b.length;
        long sum=0;
        
        for(int i=0,j=bl-1;i<j;i++,j--)
            {
                sum = sum + GCD((int)b[i],(int)b[j]);
            }
        return sum;
    }
    public long GCD(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return GCD(b,a%b);
        }
    }
}