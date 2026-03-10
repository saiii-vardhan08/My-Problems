class Solution {
    public boolean isPowerOfTwo(int n) {


        //think why only power of two.. to check and to build foundation  of logic on operators 
        if(n<=0)
        {
            return false;
        }
        else
        {
            if((n & (n-1))==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
