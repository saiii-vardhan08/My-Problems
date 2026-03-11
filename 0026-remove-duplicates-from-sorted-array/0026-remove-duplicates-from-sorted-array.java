class Solution {
    public int removeDuplicates(int[] a) {
        
   int n = a.length;

   if(n==0)
   {
    return 0;
   }

// used two pointers for the removing of element not exactly removing but erasing it from the original state 
    int i=0;
   for(int j=1;j<n;j++)
   {
        if(a[i]!=a[j])
        {
            i++;
            a[i]=a[j];
        }
   }
   return i+1;
    }
}
