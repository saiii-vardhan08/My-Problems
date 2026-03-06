class Solution {
    public int minimumPrefixLength(int[] a) {
        int n = a.length;
        int i = n-2;
        while(i>=0 && a[i+1]>a[i])
            {
               i--;
            }
        return i+1;
        
    }
}