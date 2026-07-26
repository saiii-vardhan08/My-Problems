class Solution {
    public int largestInteger(int n, int s) {
        if(s > 9*n)
        {
            return -1;
        }
        
            String ans = "";

            for(int i=0;i<n;i++)
                {
                    int d = Math.min(9,s);

                    ans = ans + d;

                    s = s - d;
                }

        return Integer.parseInt(ans);
    }
}