class Solution {
    public boolean containsNearbyDuplicate(int[] a, int k) {

      Set<Integer> st = new HashSet<>();
      for(int i=0;i<a.length;i++)
      {
        if(st.contains(a[i])) return true;
        if(st.add(a[i]));
        if(st.size()>k) st.remove(a[i-k]);
      }
      return false;
    }
}