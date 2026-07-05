class Solution {
    /*public void quicksort(int a[], int low, int high)
    {
        int i, j, pivot;
        if(low<high)
        {
            pivot=a[low];
            i=low; j=high;
            while(i<j)
            {
                while(a[i]<=pivot && i<high)
                    i++;
                while(a[j]>pivot)
                    j--;
                if(i<j)
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
            a[low]=a[j];
            a[j]=pivot;
            quicksort(a, low, j-1);
            quicksort(a,j+1, high);
        }
    }*/
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        /*quicksort(nums, 0, n-1);*/
        PriorityQueue<Integer> pq=new PriorityQueue<>(n);
        for(int i: nums)
            pq.add(i);
        int ans[]=new int[pq.size()];
        int k=pq.size();
        for(int i=0; i<k; i++)
        {
            ans[i]=pq.poll();
        }
        return ans;
    }
}