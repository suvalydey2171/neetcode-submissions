class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        int ans=1;
        char ch;
        String t=""+s.charAt(0);
        for(int i=1; i<s.length(); i++)
        {
            ch=s.charAt(i);
            if(t.contains(String.valueOf(ch)))
            {
                ans=Math.max(t.length(),ans);
                i-=t.length()-t.indexOf(ch)-1;
                t=""+s.charAt(i);
            }
            else
            {
                t=t+ch;
            }
        }
        ans=Math.max(t.length(),ans);
        return ans;
    }
}
