class Solution {
    public int[] plusOne(int[] digits) {
        int idx=digits.length-1;
        while(idx>=0)
        {
            if(digits[idx]!=9){
                digits[idx]++; return digits;
            }
            if(digits[idx]==9)
                digits[idx]=0;
            idx--;
        }
        int p[]=new int[digits.length+1];
        if(idx<0)
        {
            p[0]=1;
            for(int i=1; i<digits.length+1;i++)
                p[i]=0;
        }
        return p;
    }
}