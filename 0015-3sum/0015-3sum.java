class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        
        List<List<Integer>> anslst = new ArrayList<>();
        Arrays.sort(a);

        for(int i=0;i<a.length-2;i++)
        {
            if (i > 0 && a[i] == a[i - 1]) { continue; }
            int l = i+1;
            int r = a.length-1;

            while(l<r)
            {
                int s = a[i] + a[l] + a[r];

                if(s==0)
                {
                    List<Integer> temp = new ArrayList<>();

                    temp.add(a[i]);
                    temp.add(a[l]);
                    temp.add(a[r]);

                    anslst.add(temp);

                    l++;
                    r--;

                 while (l < r && a[l] == a[l - 1]) { l++; } 
                 while (l < r && a[r] == a[r + 1]) { r--; }
                }
                else if(s > 0)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }
        }
        return anslst;
    }
}