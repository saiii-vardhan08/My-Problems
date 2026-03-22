class Solution {
    public boolean uniformArray(int[] a) {
// think logic first parity logic ev+ev = ev od+od = ev, ev+od = od, od+ev = od;
// so we first want to find minimum element if the smallest is even then if there is odd one then by logic it is impossible to make it all even or odd 
// so we find min and if there is odd element even if one then return false or return true
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
