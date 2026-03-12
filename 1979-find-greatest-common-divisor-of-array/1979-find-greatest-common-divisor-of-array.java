class Solution {
    public int findGCD(int[] a) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = a.length;
        // 1. find max in array
        //2. find min in array
        //3. find gcd of two elements
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
    // used method of gcd to find the gcd of two numbers gcd(a,b) = gcd(b,a%b) if b!=0
    // if b=0 then a is the gcd of a and b

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
