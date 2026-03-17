class Solution {
    public int countEven(int n) {
        int c=0;
        for(int p=2;p<=n;p++)
        {
            int d =0;
            int s =0;
            for(int i=p;i>0;i=i/10)
            {
                d = i%10;
                s = s+d;
            }
            if(s%2==0)
            {
                c++;
            }
        }
        return c;
    }
}