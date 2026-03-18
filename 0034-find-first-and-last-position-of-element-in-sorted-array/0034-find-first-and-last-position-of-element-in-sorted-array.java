class Solution {
    // first when ever there is a question to find in array the first though you should get is binary search because o(logn).
    public int[] searchRange(int[] a, int t) {
        
        int f = firstO(a,t);
        int s = secondO(a,t);

        return new int[]{f,s};
        
        }
    // for this question we have to find two occurances because if 8 8 8 is there we will get mid value as 8 and index also middle one but we want right side of middle one and left most of middle one so we go to right and towards left after getting middle value 
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




