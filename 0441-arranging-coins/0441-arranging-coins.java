class Solution {
    public int arrangeCoins(int rem) {
        
            int i=1;
            int c=0;

            while(rem >= i)
            {
                rem = rem - i;
                i++;
                c++;
            }

            return c;
    }
}