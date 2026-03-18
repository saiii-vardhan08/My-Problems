class Solution {
    public int[] searchRange(int[] a, int t) {
        
        int f = firstO(a,t);
        int s = secondO(a,t);

        return new int[]{f,s};
        
        }
 public int firstO(int[] a, int t) {

    int l = 0;
    int r = a.length-1;
    int ans = -1;
    while(l<=r)
    {
        int mid = (l+r)/2;
        

        if(a[mid]==t)
        {
            ans = mid;
            r = mid - 1;
        }
        else if(a[mid]<t)
        {
            l = mid + 1;
        }
        else{
            r = mid - 1;
        }
         
    }
    return ans;
 }

 public int secondO(int[] a, int t) {

    int l = 0;
    int r = a.length-1;
    int ans = -1;
    while(l<=r)
    {
        int mid = (l+r)/2;

        if(a[mid]==t)
        {
            ans = mid;
            l = mid + 1;
        }
        else if(a[mid]<t)
        {
            l = mid + 1;
        }
        else{
            r = mid - 1;
        }
    }
    return ans;
 }
}




