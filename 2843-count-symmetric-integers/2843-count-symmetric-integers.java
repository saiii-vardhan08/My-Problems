class Solution {
    public int countSymmetricIntegers(int l, int h) {
// when even solving questions in numbers 
// always remember if you find any relation between numbers then logic or formula u can use
// but if u cant find any relation then it must be a question where you have to convert that numbers into strings and start solving 
// we can solve this is easy method also i solved in this approach because to understand string basic functions 
// substring, length, String.valueOf(), Integer.parseInt()
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
