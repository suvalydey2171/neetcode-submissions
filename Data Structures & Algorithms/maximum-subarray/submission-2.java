class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int k=nums[0];
        int min=Integer.MAX_VALUE;
        int ans=Integer.MIN_VALUE;
        min=Math.min(min,k);
        ans=Math.max(ans,k);
        for(int i=1;i<nums.length; i++)
        {
            k=k+nums[i];
            ans=Math.max(ans,k-min);
            min=Math.min(min,k);
            ans=Math.max(ans,k);
        }
        return ans;
    }
}
