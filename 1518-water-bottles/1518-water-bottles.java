class Solution {
    public int numWaterBottles(int fb, int x) {

            int ans = 0;
            int emp = fb;

            while(fb>0)
            {
                ans = ans + fb;
                fb = emp/x;
                emp = fb + (emp%x);
            }
            return ans;
    }
}