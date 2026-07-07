class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        if(n==0)
            return 0;
        int count =0;
        int p=n-1;
        while(nums[p]==val)
        {
            p--;
            count++;
            if(p==-1)
                return nums.length-count;
        }
        for(int i=0; i<p; i++)
        {
            if(nums[i]==val)
            {
                int ek=nums[i];
                nums[i]=nums[p];
                nums[p]=ek;
                while(nums[p]==val)
                {
                    p--;
                    count++;
                    if(p==-1)
                        return nums.length-count;
                }
            }
        }
        //Arrays.sort(nums,0, count);
        return nums.length-count;
    }
}