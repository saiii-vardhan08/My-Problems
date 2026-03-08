class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0)
        {
            return false;
        }
        else if (x<10)
        {
            return true;
        }
        else
        {
            int rev=0;
            for(int i=x; i>0; i=i/10)
            {
                rev= rev*10 + (i%10);
            }
            if(rev == x)
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