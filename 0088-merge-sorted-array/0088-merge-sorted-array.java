class Solution {
    public void merge(int[] a1, int m, int[] a2, int n) {
       
         // I used two pointers
        // since two arrays are given we go for parallel pointers pointing two arryas 
        int a[] = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
// this lopp for adding lower possible values in new array 
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

        // this is for remaining elemensts in a1
        while(i<m)
        {
            a[k++] = a1[i++];
        }
// this is for remaining elements in a2
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
