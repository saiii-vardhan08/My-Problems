class Solution {
    public int findMaxConsecutiveOnes(int[] a) {
        
        int i=0;
        int poc = 0;
        int moc = 0;

        while(i<a.length)
        {
            if(a[i]==0)
            {
                if(poc > moc)
                {
                    moc = poc;
                }
                poc=0;
            }
            if(a[i]==1)
            {
                poc++;
            }
            i++;
        }

        if(moc<poc)
        {
            return poc;
        }
        else
        {
            return moc;
        }
        
    }
}