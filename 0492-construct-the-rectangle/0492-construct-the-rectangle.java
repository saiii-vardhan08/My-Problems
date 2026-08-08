class Solution {
    public int[] constructRectangle(int n) {
        for (int b = (int)Math.sqrt(n); b >= 1; b--) {
            if (n % b == 0) {
                int l = n / b;
                return new int[]{l, b};
            }
        }
        return new int[]{n, 1};
    }
}