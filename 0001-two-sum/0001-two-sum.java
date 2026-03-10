class Solution {
    public int[] twoSum(int[] a, int t) {
        int n = a.length;
        int b[] = new int[2];
        for(int i=0;i<n;i++)
        {
           //this is for comparing with next elements when condition met then return
                for(int j=i+1;j<n;j++)
                {
                    
                    if(a[i]+a[j]==t)
                    {
                        b[0]=i;
                        b[1]=j;
                        return b;
                    }
                }
                
            
            
        }
        return b;
    }
}
