class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> k=new HashSet<>();
        int count=0;
        while(count==k.size())
        {
            int sum=0;
            while(n>0)
            {
                sum+=(n%10)*(n%10);
                n=n/10;
            }
            n=sum;
            if(n==1)
                return true;
            count++;
            k.add(n);
        }
        return false;
    }
}
