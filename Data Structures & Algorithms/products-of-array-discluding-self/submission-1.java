class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pref[]=new int[n];
        int suff[]=new int[n];
        pref[0]=1; suff[n-1]=1;
        int pp=1, ps=1;
        int idxp=1, idxs=n-2;
        for(int i=0; i<n; i++)
        {
            if(i!=0)
            {
                pref[idxp]=pref[idxp-1]*nums[i-1];
                idxp++;
            }
            if(i!=n-1)
            {
                suff[idxs]=suff[idxs+1]*nums[n-i-1];
                idxs--;
            }
        }
        for(int i=0; i<n; i++)
        {
            nums[i]=pref[i]*suff[i];
        }
        return nums;
    }
}  
