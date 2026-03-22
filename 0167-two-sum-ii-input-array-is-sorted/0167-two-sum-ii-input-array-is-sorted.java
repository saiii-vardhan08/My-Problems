class Solution {
    public int[] twoSum(int[] a, int t) {
        
        int i=0;
        int j=a.length-1;

        while(i<j)
        {
            int sum = a[i]+a[j];

            if(sum==t)
            {
                return new int[]{i+1,j+1};
            }
            else if(sum>t)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return new int[]{-1, -1};
    }
   
}