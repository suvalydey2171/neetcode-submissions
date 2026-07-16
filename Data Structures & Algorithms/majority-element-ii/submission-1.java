class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int num1=-1, num2=-1;
        int c1=0, c2=0;
        for(int i:nums)
        {
            if(i==num1)
                c1++;
            else if(i==num2)
                c2++;
            else if(c1==0)
            {
                c1++; num1=i;
            }
            else if(c2==0)
            {
                c2++; num2=i;
            }
            else
            {
                c1--; c2--;
            }
        }
        c1=c2=0;
        for(int i:nums)
        {
            if(i==num1)
                c1++;
            else if(i==num2)
                c2++;
        }
        List<Integer> ans=new ArrayList<>();
        if(c1>n/3) ans.add(num1);
        if(c2>n/3) ans.add(num2);
        return ans;
    }
}