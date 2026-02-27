class Solution {
    public int findNumbers(int[] a) {
        
        int n = a.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            int dc = 0;

            for(int j=a[i];j>0;j=j/10)
            {
                dc++;
            }
            if(dc%2==0)
            {
                c++;
            }
        }
        return c;
    }
}