class Solution {
    public boolean checkPerfectNumber(int n) {
        int s=0;
        for(int p=1;p<=n/2;p++)
        {
            if(n%p==0)
            {
                s=s+p;
            }
        }
        if(s==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}