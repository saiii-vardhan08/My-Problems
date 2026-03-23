class Solution {
    public int strStr(String haystack, String needle) {
        
        // java has inbuilt function of indexOf which return the first occurance a string or character or string in particular string 

        if(haystack.indexOf(needle)!=-1)
        {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
