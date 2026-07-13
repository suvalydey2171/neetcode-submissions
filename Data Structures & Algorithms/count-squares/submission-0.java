class CountSquares {
    HashMap<List<Integer>,Integer> m;

    public CountSquares() {
        m=new HashMap<>();
    }
    
    public void add(int[] point) {
        List<Integer> l = Arrays.asList(point[0],point[1]);
        m.put(l,m.getOrDefault(l,0)+1);
    }
    
    public int count(int[] point) {
        int c=0;
        for(Map.Entry<List<Integer>,Integer> e:m.entrySet())
        {
            List<Integer> t=e.getKey();
            if(t.get(0)==point[0] && t.get(1)==point[1])
                continue;
            if(Math.abs(t.get(0)-point[0])==Math.abs(t.get(1)-point[1]))
            {
                List<Integer> p1 = Arrays.asList(t.get(0), point[1]);
                List<Integer> p2 = Arrays.asList(point[0], t.get(1));
                if(m.containsKey(p1) && m.containsKey(p2))
                {
                    c+=m.get(p1)*m.get(p2)*e.getValue();
                }
            }
        }
        return c;
    }
}
