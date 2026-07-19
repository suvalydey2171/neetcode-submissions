class Solution {
    public int[] asteroidCollision(int[] as) {
        ArrayDeque<Integer> stk=new ArrayDeque<>();
        for(int i=0; i<as.length; i++)
        {
            /*if((stk.peek()>0 && as[i]<0))
            {
                stk.push(as[i]);
                while(stk.size()>1)
                {
                    int a=stk.pop();
                    int b=stk.pop();
                    if(Math.abs(a)>Math.abs(b))
                        stk.push(a);
                    else if(Math.abs(a)==Math.abs(b))
                        continue;
                    else 
                    {
                        stk.push(b); stk.push(a);
                        break;
                    }
                }
            }
            else
                stk.push(as[i]);*/
            int c=as[i];
            boolean fl=true;
            while(fl && stk.size()>0 && stk.peek()>0 && c<0)
            {
                if(Math.abs(c)<stk.peek()) fl=false;
                else if(Math.abs(c)==stk.peek()) 
                { 
                    stk.pop();
                    fl=false;
                }
                else stk.pop();
            }
            if(fl) stk.push(c);
        }
        int ans[]=new int[stk.size()];
        for(int i=stk.size()-1; i>=0; i--)
        {
            ans[i]=stk.pop();
        }
        return ans;
    }
}