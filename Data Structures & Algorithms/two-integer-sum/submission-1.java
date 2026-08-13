class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        LinkedHashSet<Integer> h=new LinkedHashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            if(h.contains(target-nums[i]))
            {
                ans[1]=i;
                break;
            }
            h.add(nums[i]);
        }
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==target-nums[ans[1]])
            {
                ans[0]=i;
                break;
            }
        }
        return ans;
    }
}
