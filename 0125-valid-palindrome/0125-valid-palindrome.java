class Solution {
    public boolean isPalindrome(String s) {
        // this is regex which replaces everything with empty string 
        //like ^ this is not operator which tells not letters and not numbers
        // anything except these will be replaced 

        // I used two pointers 
        // since palidrome check i go for converging pointers
        String s1 = s.replaceAll("[^a-zA-Z0-9]","");
        s = s1.toLowerCase();
        int i=0;
        int j= s.length()-1;

        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
