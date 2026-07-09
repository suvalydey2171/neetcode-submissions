/*class MyHashSet {
    List<Integer> l;
    public MyHashSet() {
        l=new ArrayList<>();
    }
    
    public void add(int key) {
        if(!contains(key))
            l.add(key);
    }
    
    public void remove(int key) {
        if(contains(key))
            l.remove(Integer.valueOf(key));
        System.out.println(l.toString());
    }
    
    public boolean contains(int key) {
        return l.contains(key);
    }
}*/

class MyHashSet {
    List<Integer> l[];
    public MyHashSet() {
        l=new LinkedList[1001];
    }
    
    public void add(int key) {
        int p=key%1000;
        if(l[p]==null)
            l[p]=new LinkedList<>();
        if(!l[p].contains(key))
            l[p].add(key);
    }
    
    public void remove(int key) {
        int p=key%1000;
        if(l[p]!=null && l[p].contains(key))
            l[p].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int p=key%1000;
        if(l[p]==null) return false;
        return l[p].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */