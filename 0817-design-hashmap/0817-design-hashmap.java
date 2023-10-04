class MyHashMap {
    ArrayList<Integer> k = new ArrayList<>();
    ArrayList<Integer> val = new ArrayList<>();

    public MyHashMap() {
        //Nothing here
        k.clear();
        val.clear();
    }
    
    public void put(int key, int value) {
        if(k.contains(key)){
            int i = k.indexOf(key);
            val.set(i, value);
        }
        else{
            k.add(key);
            val.add(value);
        }
    }
    
    public int get(int key) {
        if(k.contains(key)){
            int i = k.indexOf(key);
            return val.get(i);
        }
        
        return -1;
    }
    
    public void remove(int key) {
        if(k.contains(key)){
            int i = k.indexOf(key);
            k.remove(i);
            val.remove(i);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */