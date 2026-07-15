class Solution {
    public void rotate(int[] nums, int k) {
        
        int a[] = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            int ni = (i+k) % nums.length;

            a[ni] = nums[i];
        }

       for(int i=0;i<a.length;i++)
       {
            nums[i] = a[i];
       }
    }
}