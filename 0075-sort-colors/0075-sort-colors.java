class Solution {
    public void sortColors(int[] a) {
        int n = a.length;
        int zc=0;
        int oc=0;
        int tc=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                zc++;
            }
            if(a[i]==1)
            {
                oc++;
            }
            if(a[i]==2)
            {
                tc++;
            }
        }

        for(int i=0;i<zc;i++)
        {
            a[i]=0;
        }
        for(int j=zc;j<oc+zc;j++)
        {
            a[j]=1;
        }
        for(int k=oc+zc;k<n;k++)
        {
            a[k]=2;
        }
    }

}