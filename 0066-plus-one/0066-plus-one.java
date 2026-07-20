class Solution {
    public int[] plusOne(int[] d) {
        
       for(int j=d.length-1;j>=0;j--)
       {
        if(d[j]<9)
        {
            d[j]++;
            return d;
        }
        d[j] = 0;
       }

       int a[] = new int[d.length+1];

       a[0] = 1;

       return a;

    }
}