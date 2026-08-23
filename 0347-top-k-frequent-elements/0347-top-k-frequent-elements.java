class Solution {
    public int[] topKFrequent(int[] a, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        int ans[] = new int[k];

        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],1+map.getOrDefault(a[i],0));
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((b,c)-> b.getValue()-c.getValue());

        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            pq.add(e);
            if(pq.size()>k)
            {
                pq.remove();
            }
        }

        for(int i=0;i<k;i++)
        {
            ans[i] = pq.remove().getKey();
        }


        return ans;
    }

}