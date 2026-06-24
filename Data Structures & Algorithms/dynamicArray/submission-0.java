class DynamicArray {

    private List<Integer> list; 
    private int capacity; 

    public DynamicArray(int capacity) {
        list = new ArrayList<>();
        this.capacity = capacity; 
    }

    public int get(int i) {
        return list.get(i); 
    }

    public void set(int i, int n) {
        list.set(i, n); 
    }

    public void pushback(int n) {
        if (list.size() == this.capacity) this.resize(); 
        list.add(n); 
    }

    public int popback() {
        return list.remove(list.size()-1); 
    }

    private void resize() {
        this.capacity *= 2; 
    }

    public int getSize() {
        return list.size(); 
    }

    public int getCapacity() {
        return this.capacity; 
    }
}
