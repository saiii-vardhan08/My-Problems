class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n<=0)
        {
            return false;
        }
        else{
        int x=1;
        for(int i=0;i<=19;i++)
        {
            if(x==n)
            {
                return true;
            }
            x*=3;
        }
        return false;
        }
    }
}