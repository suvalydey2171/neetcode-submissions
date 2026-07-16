class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        n--;
        while(n>0 && n<nums.length && nums[n]==2)
            n--;
        for(int i=0; i<=n; i++)
        {
            if(nums[i]==2)
            {
                int temp=nums[n];
                nums[n]=nums[i];
                nums[i]=temp;
                n--;
                while(n>0 && n<nums.length && nums[n]==2)
                    n--;
            }
            if(nums[i]==0)
            {
                int p=i;
                while(p>0 && nums[p-1]!=0)
                {
                    int temp=nums[p];
                    nums[p]=nums[p-1];
                    nums[p-1]=temp;
                    p--;
                }
            }
        }
    }
}