class Solution {
    public boolean isAnagram(String s, String t) {
        
        char sa[] = s.toCharArray();
        char ta[] = t.toCharArray();

        Arrays.sort(sa);
        Arrays.sort(ta);

        s = String.valueOf(sa);
        t = String.valueOf(ta);

        if(s.equals(t))
        {
            return true;
        }
        else
        {
            return false;
        }


    }
}