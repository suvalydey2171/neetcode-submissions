class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0;
        int pref[]=new int[nums.length+1];
        pref[0]=0;
        for(int i=0; i<nums.length; i++)
        {
            pref[i+1]=pref[i]+nums[i];
        }
        for(int i=1; i<=nums.length; i++)
        {
            if(pref[i]==k)
                ans++;
            for(int j=1; j<i; j++)
            {
                if(pref[i]-pref[j]==k)
                    ans++;
            }
        }
        return ans;
    }
}