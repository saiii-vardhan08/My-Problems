class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return (int)atmost(nums,k) - atmost(nums,k-1); 
    }

    public int atmost(int a[],int k){
        int r=0;
        int l=0;
        int cs=0;
        Map<Integer,Integer> map  = new HashMap<>();
        while(r<a.length)
        {
            map.put(a[r],map.getOrDefault(a[r],0)+1);

            while(map.size() > k)
            {
                map.put(a[l],map.get(a[l])-1);
                if(map.get(a[l])==0) map.remove(a[l]);
                l++;
            }

            cs = cs + (r-l+1);
            r++;
        }
        return cs;
    }

}