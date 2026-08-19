class Solution {
    public boolean containsDuplicate(int[] a) {
       
       Set<Integer> st = new HashSet<>();

        for(int i=0;i<a.length;i++)
        {
            if(st.contains(a[i]))
            {
                return true;
            }
            st.add(a[i]);
        }
        return false;
    }
}