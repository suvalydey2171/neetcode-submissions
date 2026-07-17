class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int k=0;
        int min=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length; i++)
        {
            k=k+nums[i];
            ans=Math.max(ans,k-min);
            min=Math.min(min,k);
            ans=Math.max(ans,k);
        }
        return ans;
    }
}
