class Solution {
    public int countSymmetricIntegers(int l, int h) {

        int sc=0;
        for(int i=l;i<=h;i++)
        {

            int dc=0;
            
            for(int j=i;j>0;j=j/10)
            {
                dc++;
            }
            if(dc%2==0)
            {
                
                String ns = String.valueOf(i);

                int sl = ns.length();

                String fh = ns.substring(0,sl/2);
                String sh = ns.substring(sl/2);

                int fhn = Integer.parseInt(fh);
                int shn = Integer.parseInt(sh);
                int fs=0;
                int ss=0;
                for(int k=fhn;k>0;k=k/10)
                {
                    fs = fs + (k%10);
                }
                for(int k=shn;k>0;k=k/10)
                {
                    ss = ss + (k%10);
                }
                if(ss==fs)
                {
                    sc++;
                }
            }
           
        }
        return sc;
        
    }
}