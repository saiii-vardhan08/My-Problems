class Solution {
    public List<List<String>> groupAnagrams(String[] s) {
        
        Map<String,List<String>> map = new HashMap<>();

        for(int i=0;i<s.length;i++)
        {
            String word = s[i];

            int a[] = new int[26];

            for(int j=0;j<word.length();j++)
            {
                a[word.charAt(j)-97]++;
            }

            StringBuilder sb = new StringBuilder();

            for(int k=0;k<a.length;k++)
            {
                sb.append(a[k]).append('#');
            }
            
            String key = sb.toString();

            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(word);

        }

        return new ArrayList<>(map.values());
    }
}