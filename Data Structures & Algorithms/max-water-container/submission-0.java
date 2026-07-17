class Solution {
    public int maxArea(int[] height) {
        int r=0, l=height.length-1;
        int max=Integer.MIN_VALUE;
        while(r<l)
        {
            int k=Math.min(height[r],height[l]);
            max=Math.max(k*(l-r),max);
            if(k==height[r]) r++;
            else l--;
        }
        return max;
    }
}
