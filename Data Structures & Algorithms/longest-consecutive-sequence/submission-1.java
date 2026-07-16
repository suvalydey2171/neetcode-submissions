class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> s=new HashSet<>();
        for(int i:nums)
            s.add(i);
        int max=0;
        for(int i:s)
        {
            if(!s.contains(i-1))
            {
                int l=1;
                while(s.contains(i+l))
                    l++;
                max=Math.max(l,max);
            }
        }
        return max;
    }
}
