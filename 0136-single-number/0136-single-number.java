class Solution {
    public int singleNumber(int[] a) {
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int x : a)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int ans =0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                ans = entry.getKey();
                break;
            }
        }

    return ans;

    }
}