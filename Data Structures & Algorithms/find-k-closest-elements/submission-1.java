class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < arr.length && arr[i] < x) {
            i++;
        }
        int l = i - 1;
        int r = i;
        while (ans.size() < k) {
            if (l < 0) {
                ans.add(arr[r]);
                r++;
            }
            else if (r >= arr.length) {
                ans.add(arr[l]);
                l--;
            }
            else if (Math.abs(arr[l] - x) <= Math.abs(arr[r] - x)) {
                ans.add(arr[l]);
                l--;
            }
            else {
                ans.add(arr[r]);
                r++;
            }
        }
        Collections.sort(ans);
        return ans;
    }
}