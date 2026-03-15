class Solution {
    public int findDuplicate(int[] a) {


        // used floyd's algorithm of linked lists which uses slow pointer and fast pointer and when it meets, it breaks and make slow pointer to start and takes steps until slow is equal to fast then return slow
        
        int slow = a[0];
        int fast = a[0];

        while(true)
        {
            slow = a[slow];
            fast = a[a[fast]];

            if(slow == fast)
            {
                break;
            }
        }

        slow = a[0];

        while(slow!=fast)
        {
            slow = a[slow];

            fast = a[fast];
        }

        return slow;

        
        
    }
}
