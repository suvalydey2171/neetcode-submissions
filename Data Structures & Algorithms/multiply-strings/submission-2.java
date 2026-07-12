class Solution {
    public int digit(char c)
    {
        return (int)(c)-48;
    }
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        if(num1.equals("1")) return num2;
        if(num2.equals("1")) return num1;
        int ans[]=new int[num1.length()+num2.length()];
        for(int i=num1.length()-1; i>=0; i--)
        {
            for(int j=num2.length()-1; j>=0; j--)
            {
                int p=i+j+1, q=i+j;
                int x=ans[p]+digit(num1.charAt(i))*digit(num2.charAt(j));
                ans[p]=x%10;
                ans[q]+=x/10;
            }
        }
        StringBuilder st=new StringBuilder();
        int i=0;
        while(i<ans.length && ans[i]==0)
            i++;
        while(i<ans.length)
            st.append(ans[i++]);
        return st.toString();
    }
}