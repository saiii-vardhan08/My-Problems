class Solution {
    public int maxVowels(String s, int k) {
        
        int vc=0;


        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
            {
                vc++;
            }
        }

        int mvc = vc;

        for(int i=1;i<=s.length()-k;i++)
        {
            int n=0;
            int p=0;

            if(isVowel(s.charAt(i+k-1)))
            {
                n=1;
            }
            if(isVowel(s.charAt(i-1)))
            {
                p=1;
            }

            vc = vc + n - p;

            mvc = Math.max(mvc,vc);
        }

        return mvc;

    }

public boolean isVowel(char ch)
{
    return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
}
}