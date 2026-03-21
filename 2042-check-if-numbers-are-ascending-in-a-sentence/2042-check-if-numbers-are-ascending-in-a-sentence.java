class Solution {
    public boolean areNumbersAscending(String s) {
        // I learned one new functions in characteres 1. character.isDigit() which is for checking a character is number or not, returns true or false 
        // first i tried one approach which only checks each and every character if digit then store it in prev and compare this failed because if there is 12 which is two digit number it is checking like 1, 2.
        // but this is not a case so i need to went for this approach when there are continuos numbers we need to form a number before storing or comparing.
        int sl = s.length();
        int prev = -1;

        for(int i=0; i<sl; i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
               int n = 0;

                // converting two or more digit charactered number into integer number.
                // charcter to number we have to remove '0'
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
