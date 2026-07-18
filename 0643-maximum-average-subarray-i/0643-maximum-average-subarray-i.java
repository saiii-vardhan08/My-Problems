class Solution {
    public double findMaxAverage(int[] a, int k) {
        
        int s=0;
        for(int i=0;i<k;i++)
        {
            s+=a[i];
        }

        double ma = (double)s / k;

        for(int i=1;i<=a.length-k;i++)
        {
            s = s + a[i+k-1] - a[i-1];

            ma = Math.max(ma,(double)s/k);
        } 

        return ma;
    }

}