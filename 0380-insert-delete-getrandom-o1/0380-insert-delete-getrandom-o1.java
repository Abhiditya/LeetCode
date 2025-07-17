class RandomizedSet {
    private HashSet<Integer> hash;
    private List<Integer> list;
    private Random rand;

    public RandomizedSet() {
        hash = new HashSet<>();
        list = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(hash.contains(val)) return false;
        hash.add(val);
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!hash.contains(val)) return false;
        hash.remove(val);
        list.set(list.indexOf(val),list.get(list.size() - 1));
        list.remove(list.size() - 1);
        return true;
    }
    
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */