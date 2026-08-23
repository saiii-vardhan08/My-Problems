class Solution {
    public int[] topKFrequent(int[] a, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        int ans[] = new int[k];

        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],1+map.getOrDefault(a[i],0));
        }

        // manam map ni sort cheyyalem kani list ni sort cheyochu so andhuke manam map ni list loki convert chesukunnam

        List<Map.Entry<Integer,Integer>> lst = new ArrayList<>(map.entrySet());
        
        //sort based on getvalue

        lst.sort((b,c)->{
            return c.getValue() - b.getValue();
        });

        for(int i=0;i<k;i++)
        {
            ans[i] = lst.get(i).getKey();
        }

        return ans;
    }

}