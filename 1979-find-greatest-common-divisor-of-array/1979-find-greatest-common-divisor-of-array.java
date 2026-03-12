class Solution {
    public int findGCD(int[] a) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = a.length;
        for(int i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
            if(a[i]<min)
            {
                min = a[i];
            }
        }

        int ans = GCD(min,max);

        return ans;
        
    }

public int GCD(int a,int b)
{
    if(b==0)
    {
        return a;
    }
    else{
        return GCD(b,a%b);
    }
}

}