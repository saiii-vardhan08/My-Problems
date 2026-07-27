class Solution {
    public int maxProfit(int[] a) {
        
        int min_value = Integer.MAX_VALUE;
        int max_difference = 0;

        for(int i=0;i<a.length;i++)
        {
            min_value = Math.min(min_value,a[i]);
            max_difference = Math.max(max_difference,a[i]- min_value);
        }

        return max_difference;
    }
}