class Solution {
    public String gcdOfStrings(String a, String b) {
        
        int al = a.length();
        int bl = b.length();
        if((a+b).equals(b+a)){
        int ans = GCD(al,bl);
        return (a+b).substring(0,ans);
        }
        else
        {
            return "";
        }
    }
    public static int GCD(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return GCD(b,a%b);
        }
    }
}