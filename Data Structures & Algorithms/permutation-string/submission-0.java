class Solution {
    public boolean checkInclusion(String s1, String s2) {
        /*HashMap<Character, Integer> map=new HashMap<>();
        for(char c:s2.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        for(char c:s1.toCharArray())
            map.put(c,map.getOrDefault(c,0)-1);
        for(Map.Entry<Character,Integer> e:map.entrySet())
        {
            if(e.getValue()<0)
                return false;
        }
        return true;*/
        int freq[]=new int[26];
        for(char c:s1.toCharArray())
            freq[c-'a']++;
        int x[]=new int[26];
        for(int i=0; i<=s2.length()-s1.length(); i++)
        {
            Arrays.fill(x,0);
            for(char c:s2.substring(i,i+s1.length()).toCharArray())
                x[c-'a']++;
            if(Arrays.equals(freq,x)) return true;
        }
        return false;
    }
}
