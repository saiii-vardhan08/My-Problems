class Solution {
    public int[] productExceptSelf(int[] a) {
        
            int n = a.length;
        // this is the question where you have to wait and think for tc of the approach 
        // first i thought about the brute force solution which is taking the prefix product and suffix product for each and every time and take its pro and return 
        // but in that approach it makes the tc o(n^2) but in the question it mentioned 0(n) so we have diff approach, so think 
        int p[] = new int[n];
        int s[] = new int[n];
        int ans[] = new int[n];

        p[0] = 1;
        for(int i=1;i<n;i++)
        {
            p[i] = p[i-1] * a[i-1];
        }

        s[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            s[i] = s[i+1] * a[i+1];
        }

        for(int i=0;i<n;i++)
        {
            ans[i] = p[i] * s[i];
        }
        return ans;
    }
}
