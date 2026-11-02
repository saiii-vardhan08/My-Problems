class Solution {
    public int[] dailyTemperatures(int[] a) {
        int ans[] = new int[a.length];

        Stack<Integer> stk = new Stack<>();

        stk.push(0);
        
        for(int i=1;i<a.length;i++)
        {
            while(!stk.isEmpty() && a[i] > a[stk.peek()])
            {
                int prev = stk.pop();

                ans[prev] = i-prev;
            }
            stk.push(i);
        }

        return ans;
    }
}