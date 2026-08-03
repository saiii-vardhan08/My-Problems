class Solution {
    public int lastStoneWeight(int[] a) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<a.length;i++)
        {
            pq.add(a[i]);
        }

        int ans =0;
        while(pq.size()>1)
        {
            int h1 = pq.remove();
            int h2 = pq.remove();

            pq.add(h1-h2);
        }
        ans = pq.peek();
        return ans;
    }
}