class Solution {
    public int countConsistentStrings(String al, String[] w) {
        
        int c = 0;
        

        for(int i=0;i<w.length;i++)
        {
            boolean b = false;
           int n = w[i].length();
           
           for(int j=0;j<n;j++)
           {
                if(al.indexOf(w[i].charAt(j))==-1)
                {
                    b = true;
                    break;
                }
           }
           if(!b)
           {
             c++;
           }
        }
        return c;
    }
}