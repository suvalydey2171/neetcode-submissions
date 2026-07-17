class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max=nums[0], cur=0;
        int min=nums[0], cur2=0;
        int sum=0;
        for(int i:nums)
        {
            if(cur<0) cur=0;
            cur+=i;
            max=Math.max(cur,max);
            sum+=i;
            if(cur2>0) cur2=0;
            cur2+=i;
            min=Math.min(cur2,min);
        }
        if(sum==min) return max;
        return Math.max(max,sum-min);
    }
}