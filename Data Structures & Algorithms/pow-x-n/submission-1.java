class Solution {
    public double myPow(double x, int n) {
        /*double p=1;
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
        */
        //the above one works fine, but in case that n=Integer.MIN_VALUE,
        // the value of n=n*(-1) exceeds the limit that n can store
        // thus the following solution is the best way to solve this problem

        double p=1;
        long N=n;
        boolean neg=(N<0)?true:false;
        if(neg) N=N*(-1);
        while(N>0)
        {
            if(N%2==1)
                p=p*x;
            x=x*x;
            N=N/2;
        }
        if(neg)
            p=1/p;
        return p;
    }
}
