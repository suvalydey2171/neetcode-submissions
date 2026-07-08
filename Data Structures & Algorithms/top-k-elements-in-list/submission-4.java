class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> m=new HashMap<>();
        for(int i=0; i<nums.length; i++)
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        int maxfreq=0;
        for(Map.Entry<Integer,Integer>e:m.entrySet())
            maxfreq=Math.max(maxfreq,e.getValue());
        ArrayList<Integer> freq[]=new ArrayList[maxfreq+1];
        for(Map.Entry<Integer,Integer> e:m.entrySet())
        {
            if(freq[e.getValue()]==null)
                freq[e.getValue()]=new ArrayList<>();
            freq[e.getValue()].add(e.getKey());
        }
        int ans[]=new int[k];
        int p=0;
        for(int i=freq.length-1; i>0; i--)
        {
            if(freq[i]==null)
                continue;
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
