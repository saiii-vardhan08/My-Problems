class Solution {
    public boolean containsDuplicate(int[] a) {
        Arrays.sort(a);
        boolean b = false;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                b = true;
                break;
            }
        }
        return b;
    }
}