class Solution {
    public int[] rotateElements(int[] a, int k) {
        int n = a.length;

        int c=0;

        for(int i=0;i<n;i++)
            {
                if(a[i]>=0)
                {
                    c++;
                }
            }
         if(c==0)
         {return a;
             }
        int b[] = new int[c];
        int j=0;
        for(int i=0;i<n;i++)
            {
                if(a[i]>=0)
                {
                    b[j++]=a[i];
                }
            }

        k=k%c;

        int r[] = new int[c];
        int idx =0;
        for(int i=k;i<c;i++)
            r[idx++]=b[i];
        for(int i=0;i<k;i++)
            r[idx++]=b[i];

        idx =0;

        for(int i=0;i<n;i++)
            {
                if(a[i]>=0)
                {
                    a[i]=r[idx++];
                }
            }

        return a;
    }
}