class Solution {
    public int majorityElement(int[] a) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int x : a)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getValue() > a.length / 2)
            {
                return e.getKey();
            }
        }

        return -1;
    }
}