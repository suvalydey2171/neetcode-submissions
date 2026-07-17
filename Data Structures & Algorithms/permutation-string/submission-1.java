class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int freq[]=new int[26];
        for(char c:s1.toCharArray())
            freq[c-'a']++;
        int x[]=new int[26];
        Arrays.fill(x,0);
        for(char c:s2.substring(0,s1.length()).toCharArray())
            x[c-'a']++;
        for(int i=0; i<s2.length()-s1.length(); i++)
        {
            if(Arrays.equals(freq,x)) return true;
            x[s2.charAt(i)-'a']--;
            x[s2.charAt(i+s1.length())-'a']++;
        }
        if(Arrays.equals(freq,x)) return true;
        return false;
    }
}
