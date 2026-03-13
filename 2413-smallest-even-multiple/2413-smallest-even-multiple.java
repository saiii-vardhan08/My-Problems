class Solution {
    public int smallestEvenMultiple(int n) {

    int lcm = (2*n)/(GCD(2,n));
    return lcm;
        
    }

    public static int GCD(int a,int b)
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