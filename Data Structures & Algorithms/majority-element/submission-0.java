class Solution {
    public int majorityElement(int[] nums) {
        int k=nums.length/2;
        if(k*2!=nums.length) k++;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()>=k) return e.getKey();
        }
        return -1;
    }
}