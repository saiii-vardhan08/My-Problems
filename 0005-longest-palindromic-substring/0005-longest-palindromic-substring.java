class Solution {
    public String longestPalindrome(String s) {
        
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