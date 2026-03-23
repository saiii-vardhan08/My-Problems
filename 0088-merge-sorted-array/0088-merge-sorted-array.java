class Solution {
    public void merge(int[] a1, int m, int[] a2, int n) {


        // Used two pointers Approach 
        //since two arrays parallel pointers approach 
        int a[] = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<m && j<n)
        {
            if(a1[i]<=a2[j])
            {
                a[k++] = a1[i++];
            }
            else
            {
                a[k++] = a2[j++];
            }
        }

        // to add remaining elements in new arryay
        while(i<m)
        {
            a[k++] = a1[i++];
        }
        while(j<n)
        {
            a[k++] = a2[j++];
        }

        
        for(int x=0;x<m+n;x++)
        {
            a1[x]=a[x];
        }

        
        
    }
}
