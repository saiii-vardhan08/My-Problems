class Solution {
    public int countDigits(int n) {
        int c=0;
        int d =0;
        for(int i=n;i>0;i=i/10)
        {
            d = i%10;
            if((n%d)==0)
            {
                c++;
            }
        }
        return c;
    }
}