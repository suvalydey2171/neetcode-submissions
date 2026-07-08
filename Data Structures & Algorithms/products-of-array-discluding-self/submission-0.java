class Solution {
    public int[] productExceptSelf(int[] nums) {
        //used the division operator ;-;
        int p=1;
        int c=0, idx=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=0)
                p*=nums[i];
            else
            {
                c++;
                idx=i;
            }
        }
        if(c>1)
        {
            Arrays.fill(nums,0);
            return nums;
        }
        if(c==1)
        {
            Arrays.fill(nums,0);
            nums[idx]=p;
            return nums;
        }
        for(int i=0; i<nums.length; i++)
            nums[i]=p/nums[i];
        return nums;
    }
}  
