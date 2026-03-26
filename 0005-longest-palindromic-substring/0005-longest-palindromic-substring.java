class Solution {
    public String longestPalindrome(String s) {
        // i tried and solved it in brute force in my first attempt 
        // how i approached this problem ?

        // first this is a string concept we in qn it is given  to find longest substring means we have to check substrings in brute force 
        // then here concept of palindrome is there means two pointers 

        // for two pointers we check starting and ending char and return false if they are not equal so for each substring i checked palindrom or not 
        // this gives tc o(n^3)
        // in future i will come up with another optimised approach
        int n = s.length();
        String max = "";

        for(int a=0;a<n;a++)
        {
            for(int b=a;b<n;b++)
            {
                int i = 0;
                String ss = s.substring(a,b+1);
                int j = ss.length()-1;
                boolean tf = false;
                

                while(i<=j)
                {
                    if(ss.charAt(i) != ss.charAt(j))
                    {
                        tf = true;
                        break;
                    }
                    i++;
                    j--;
                }

                if(!tf)
                {
                    if(ss.length()>max.length())
                    {
                        max = ss;
                    }
                }

            }
        }

        return max;
    }
}
