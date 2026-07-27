class Solution {
    public void sortColors(int[] a) {
        
        Map<Integer,Integer> map = new TreeMap<>();

        for(int x:a)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int j=0;
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            for(int i=0;i<e.getValue();i++)
            {
                a[j] = e.getKey();
                j++;
            }
        }


    }
}