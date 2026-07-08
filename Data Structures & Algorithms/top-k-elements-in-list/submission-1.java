class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> m=new HashMap<>();
        for(int i=0; i<nums.length; i++)
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        List<Map.Entry<Integer,Integer>> l=new ArrayList<>(m.entrySet());
        l.sort((a,b)->Integer.compare(b.getValue(),a.getValue()));
        int ans[]=new int[k];
        for(int i=0; i<k; i++)
        {
            ans[i]=l.get(i).getKey();
        }
        return ans;
    }
}
