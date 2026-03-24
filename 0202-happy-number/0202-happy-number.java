class Solution {
    public boolean isHappy(int n) {
        return sumt(n);
    }
    public boolean sumt(int n)
    {
        if(n==1)
        {
            return true;
        }
        if(n==4)
        {
            return false;
        }
       int s=0;
       for(int i=n;i>0;i=i/10)
       {
            s = s + (i%10) * (i%10);
       }

       return sumt(s);
    }
    
}