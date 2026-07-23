class Solution {
    public int maxSubArray(int[] a) {
        int cs= 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            cs = Math.max(a[i], cs+a[i]);
            max = Math.max(max,cs);
        }

        return max;
    }
}