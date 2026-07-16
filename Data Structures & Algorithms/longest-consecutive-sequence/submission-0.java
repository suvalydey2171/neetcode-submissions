class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        TreeSet<Integer> rb=new TreeSet<>();
        for(int i:nums)
            rb.add(i);
        int max=0, cc=0, pp=rb.first(), count=1;
        for(int i:rb)
        {
            if(i==pp) continue;
            cc=i;
            if(cc==pp+1) count++;
            else if(cc==pp) count=count;
            else{ max=Math.max(max,count); count=1;}
            pp=i;
        }
        max=Math.max(max,count);
        return max;
    }
}
