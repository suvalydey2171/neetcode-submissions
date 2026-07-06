class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> m= new HashMap<>();
        for(int i=0; i<strs.length; i++)
        {
            String k=strs[i];
            char ch[]=k.toCharArray();
            Arrays.sort(ch);
            k=new String(ch);
            ArrayList<String> temp=m.getOrDefault(k,new ArrayList<>());
            temp.add(strs[i]);
            m.put(k,temp);
        }
        List<List<String>> l=new ArrayList<>();
        for(Map.Entry<String, ArrayList<String>> e: m.entrySet())
        {
            l.add(e.getValue());
        }
        return l;
    }
}
