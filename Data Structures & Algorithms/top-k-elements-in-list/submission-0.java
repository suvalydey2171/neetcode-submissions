class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> m=new HashMap<>();
        for(int i=0; i<nums.length; i++)
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        List<Map.Entry<Integer,Integer>> l=new ArrayList<>(m.entrySet());
        l.sort((a,b)->Integer.compare(b.getValue(),a.getValue()));
        LinkedHashMap<Integer, Integer> lm=new LinkedHashMap<>();
        for(int i=0; i<l.size(); i++)
        {
            int key=l.get(i).getKey();
            int v=l.get(i).getValue();
            lm.put(key,v);
        }
        int ans[]=new int[k];
        int i=0;
        for(Map.Entry<Integer,Integer> e: lm.entrySet())
        {
            ans[i]=e.getKey();
            i++;
            if(i==k)
                return ans;
        }
        return ans;
    }
}
