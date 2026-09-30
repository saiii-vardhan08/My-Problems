class Solution {
    public int totalFruit(int[] a) {
        int l=0;
        int r=0;
        int max = Integer.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();

        while(r<a.length)
        {
            map.put(a[r],map.getOrDefault(a[r],0)+1);

            while(map.size() > 2)
            {
                map.put(a[l],map.get(a[l])-1);
                if(map.get(a[l])==0) map.remove(a[l]);
                l++;
            }
            max = Math.max(max,r-l+1);
            r++;
        }
     return max;
    }

}