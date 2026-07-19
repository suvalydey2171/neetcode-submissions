class Solution {
    public int digit(String s)
    {
        int d=0;
        int i=0;
        if(s.charAt(0)=='-') i++;
        while(i<s.length())
        {
            d=d*10+(int)(s.charAt(i)-'0');
            i++;
        }
        if(s.charAt(0)=='-') return (-1)*d;
        return d;
    }

    public int operate(int b, int a, String s)
    {
        if(s.equals("+")) return a+b;
        if(s.equals("-")) return a-b;
        if(s.equals("*")) return a*b;
        if(s.equals("/")) return a/b;
        return 0;
    }

    public int evalRPN(String[] tokens) 
    {
        if(tokens.length==1) return digit(tokens[0]);
        ArrayDeque<Integer> stk=new ArrayDeque<>();
        for(int i=0; i<tokens.length; i++)
        {
            if(!(tokens[i].equals("*") || tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/")))
            {
                stk.push(digit(tokens[i]));
            }
            else
            {
                int a=stk.pop();
                int b=stk.pop();
                stk.push(operate(a,b,tokens[i]));
            }
        }
        return stk.pop();
    }
}