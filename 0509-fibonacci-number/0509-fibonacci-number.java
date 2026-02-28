class Solution {
    public int fib(int n) {
        
        if(n==0){
            return 0;
        }
        else if(n==1)
        {
           return 1;

        }
        else
        {
            int prev = 0;
            int pres = 1;
            int next=0;
            for(int i=2 ; i<=n; i++)
            {
                next = prev + pres;
                prev = pres;
                pres = next;
            }
            return next;
        }

    }
}