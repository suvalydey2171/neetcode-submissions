class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0], cur=0;
        for(int i:nums)
        {
            if(cur<0) cur=0;
            cur+=i;
            max=Math.max(cur,max);
        }
        return max;
    }
}
