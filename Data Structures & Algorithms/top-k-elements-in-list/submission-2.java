class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> m=new HashMap<>();
        for(int i=0; i<nums.length; i++)
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        ArrayList<Integer> freq[]=new ArrayList[nums.length+1];
        for(int i=0; i<nums.length+1; i++)
            freq[i]=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:m.entrySet())
            freq[e.getValue()].add(e.getKey());
        int ans[]=new int[k];
        int p=0;
        for(int i=freq.length-1; i>0; i--)
        {
            for(int n: freq[i])
            {
                ans[p]=n;
                p++;
                if(p==k)
                    return ans;
            }
        }
        return ans;
    }
}
