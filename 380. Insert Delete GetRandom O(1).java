class RandomizedSet {
    private Map<Integer, Integer> map;
    private List<Integer> list;
    Random rand;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        // get index of element to remove
        int index = map.get(val);
        // get the last element in the list
        int lastElement = list.get(list.size()-1);
        // move the last element insread of element to remove
        list.set(index, lastElement);
        // update the new position of last element in map
        map.put(lastElement, index);
        // remove last element in list
        list.remove(list.size()-1);
        // remove element from map
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        int randomIndex = rand.nextInt(list.size());
        return list.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */