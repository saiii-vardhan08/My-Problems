class Solution {
    public int firstUniqueEven(int[] a) {


        int n = a.length;
        boolean b=false;
        int k=0;
        for(int i=0;i<n;i++)
            {
                if(a[i]%2==0)
                {
                    int c=0;

                    for(int j=0;j<n;j++)
                        {
                            if(a[i]==a[j])
                            {
                                c++;
                            }
                        }
                    if(c==1)
                    {
                        b = true;
                        k=a[i];
                        break;
                    }
                }
            }
        if(b)
        {
            return k;
        }
        else
        {
            return -1;
        }
        
    }
}