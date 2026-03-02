class Solution {
    public int tribonacci(int n) {
            if(n==0)
            {
                return 0;
            }
            else if(n==1)
            {
                return 1;
            }
            else if(n==2)
            {
                return 1;
            }
            else{

            int prev = 0;
            int curr = 1;
            int next = 1;
            int res = 0;
            for(int i=3;i<=n;i++)
            {
                res = prev + curr + next;
                prev = curr;
                curr = next;
                next = res;
            }
            return res;

            }


    }
}