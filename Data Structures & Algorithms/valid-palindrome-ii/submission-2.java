class Solution {
    public boolean validPalindrome(String s) {
        int l=0, r=s.length()-1;
        int cnt=0;
        while(l<r)
        {
            char cl=s.charAt(l);
            char cr=s.charAt(r);
            if(cr==cl)
            {
                l++; r--; 
            }
            else
            {
                return check(s,l+1,r) || check(s,l,r-1);
            }
        }
        return true;
    }
    public boolean check(String s, int l, int r) {
        while (l < r) 
        {
            if (s.charAt(l)!=s.charAt(r))
                return false;

            l++;
            r--;
        }
        return true;
    }
}