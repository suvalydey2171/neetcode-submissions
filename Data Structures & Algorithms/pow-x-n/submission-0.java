class Solution {
    public double myPow(double x, int n) {
        double p=1;
        boolean neg=(n<0)?true:false;
        if(neg) n=n*(-1);
        while(n>0)
        {
            if(n%2==1)
                p=p*x;
            x=x*x;
            n=n/2;
        }
        if(neg)
            p=1/p;
        return p;
    }
}
