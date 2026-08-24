class Solution {
    public int countCompleteSubarrays(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }
        int k = map.size();
        return (int) atmost(a, k) - atmost(a, k - 1);
    }

    public int atmost(int a[], int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int r = 0;
        int l = 0;
        int cs = 0;

        while (r < a.length) {
            map.put(a[r], map.getOrDefault(a[r], 0) + 1);

            while (map.size() > k) {
                map.put(a[l], map.get(a[l]) - 1);
                if (map.get(a[l]) == 0) {
                    map.remove(a[l]);
                }
                l++;
            }

            cs = cs + (r - l + 1);
            r++;
        }

        return cs;
    }
}