class Solution {
    public int firstMissingPositive(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            max=Math.max(max,nums[i]);
        }
        int ans=1;
        for(int i=0; i<nums.length; i++)
        {
            while(nums[i]<nums.length && nums[i]>0 && nums[i]!=i+1 && nums[nums[i]-1]!=nums[i])
            {
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
            }
        }
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=i+1)
                return ans;
            ans++;
        }
        return ans;
    }
}