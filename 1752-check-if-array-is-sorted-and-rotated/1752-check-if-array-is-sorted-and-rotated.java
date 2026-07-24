class Solution {
    public boolean check(int[] a) {
        
        int c=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i] > a[(i+1)%a.length])
            {
                c++;
            }
        }
        
        return c<=1;
        
    }
}