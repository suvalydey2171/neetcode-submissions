class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> m=new HashMap<>();
        for(char c: s.toCharArray())
            m.put(c,m.getOrDefault(c,0)+1);
        for(char c:t.toCharArray())
            m.put(c,m.getOrDefault(c,0)-1);
        for(Map.Entry<Character,Integer> e: m.entrySet())
        {
            if(e.getValue()!=0)  
                return false;
        }
        return true;
    }
}
