class Solution {
    public int findNumbers(int[] n) {
        

        int c=0;
        for(int i=0;i<n.length;i++)
        {
            
            if(((int)Math.log10(n[i])+1) % 2 ==0)
            {
                c++;
            }
            
        }
        return c;
    }
}