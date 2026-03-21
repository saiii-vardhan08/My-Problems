class Solution {
    public boolean areNumbersAscending(String s) {
        
        int sl = s.length();
        int prev = -1;

        for(int i=0; i<sl; i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
               int n = 0;
               while(i<sl && Character.isDigit(s.charAt(i)))
               {
                    n = n*10 + s.charAt(i)-'0';
                    i++;
               }
               if(n <= prev)
               {
                return false;
               }

               prev = n;
            }
        }

        return true;
    }
}