class Solution {
    public int longestConsecutive(int[] a) {
        
        Set<Integer> st = new HashSet<>();

        for(int i=0;i<a.length;i++)
        {
            st.add(a[i]);
        }

        int mc=0;
        for(int x : st)
        {
            if(!st.contains(x-1))
            {
                int current = x;
                int c = 1;
                
                while(st.contains(current+1))
                {
                    current++;
                    c++;
                }
                mc = Math.max(c,mc);
            }
        }
        return mc;
    }
}