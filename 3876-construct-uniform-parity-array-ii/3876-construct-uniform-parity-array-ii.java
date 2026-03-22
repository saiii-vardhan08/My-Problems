class Solution {
    public boolean uniformArray(int[] a) {

        int min = Integer.MAX_VALUE;
        int od=0;
        for(int i=0;i<a.length;i++)
            {
                if(a[i]%2!=0)
                {
                    od++;
                }
                if(a[i]<min)
                {
                    min = a[i];
                }
            }
        if(min%2==0&&od>=1)
        {
            return false;
        }

        return true;
    }
}