class Solution {
    public String simplifyPath(String path) {
        /*path=new StringBuilder(path).reverse().toString();
        ArrayDeque<Character> stk=new ArrayDeque<>();
        char ch[]=path.toCharArray();
        for(int i=0; i<path.length(); i++)
        {
            if(ch[i]=='/' && stk.size()!=0 && stk.peek()!='/')
                stk.push('/');
            else if(ch[i]=='/')
                continue;
            else if(ch[i]=='.')
            {
                if(stk.size()!=0 && stk.peek()=='.' && i<path.length()-1 && ch[i+1]=='.')
                    stk.push(ch[i]);
                else if(stk.size()!=0 && stk.peek()=='.')
                {
                    stk.pop();
                    stk.pop();
                    while(stk.size()!=0 && stk.peek()!='/')
                    {    
                        char k=stk.pop();
                        System.out.println(k);
                    }
                }
                else
                    continue;
            }
            else 
                stk.push(ch[i]);
        }
        String t="";
        int n=stk.size();
        for(int i=0; i<n; i++)
        {
            t=t+stk.pop();
        }
        return t;*/

        ArrayDeque<String> stk=new ArrayDeque<>();
        for(String s:path.split("/"))
        {
            if(s.equals("") || s.equals("."))
                continue;
            else if(s.equals("..")) 
            {
                if(!stk.isEmpty())
                    stk.pop();
            }
            else
                stk.push(s);
        }
        if(stk.isEmpty())
            return "/";
        StringBuilder ans=new StringBuilder();
        while (!stk.isEmpty())
            ans.insert(0,"/"+stk.pop());
        return ans.toString();
    }
}