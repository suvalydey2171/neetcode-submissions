class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<int[]> l=new ArrayList<>();
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(matrix[i][j]==0)
                {
                    int a[]={i,j};
                    l.add(a);
                }
            }
        }
        for(int idx=0; idx<l.size(); idx++)
        {
            int a[]=l.get(idx);
            int i=a[0], j=a[1];
            for(int p=0; p<n; p++)
                matrix[i][p]=0;
            for(int p=0; p<m; p++)
                matrix[p][j]=0;
        }
    }
}