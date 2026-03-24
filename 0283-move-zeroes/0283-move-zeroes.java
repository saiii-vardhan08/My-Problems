class Solution {
    public void moveZeroes(int[] a) {
        int s=0;
        int f=0;

        while(f<=a.length-1)
        {
            if(a[f]!=0)
            {
                a[s] = a[f];
                s++;
            }
            f++;
        }
        for(int i=s;i<a.length;i++)
        {
            a[i] = 0;
        }
    }
}