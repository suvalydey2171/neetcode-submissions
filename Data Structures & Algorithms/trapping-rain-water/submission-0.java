class Solution {
    public int trap(int[] h) {
        int suff[]=new int[h.length];
        suff[h.length-1]=h[h.length-1];
        int max=h[h.length-1];
        for(int i=h.length-2; i>=0; i--)
        {
            suff[i]=Math.max(suff[i+1],h[i]);
        }
        int pref[]=new int[h.length];
        pref[0]=h[0];
        max=h[0];
        for(int i=1; i<h.length; i++)
        {
            pref[i]=Math.max(pref[i-1],h[i]);
        }
        int ans=0;
        for(int i=1; i<h.length-1; i++)
        {
            ans+=Math.min(pref[i],suff[i])-h[i];
        }
        return ans;
    }
}
