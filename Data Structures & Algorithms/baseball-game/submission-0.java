class Solution {
    public int calPoints(String[] operations) {
        List<Integer> a=new ArrayList<>();
        for(String s:operations)
        {
            if(s.equals("D")) a.add(2*a.get(a.size()-1));
            else if(s.equals("C")) a.remove(a.size()-1);
            else if(s.equals("+")) a.add(a.get(a.size()-1)+a.get(a.size()-2));
            else a.add(Integer.parseInt(s));
        }
        int sum=0;
        for(int i:a) sum+=i;
        return sum;
    }
}