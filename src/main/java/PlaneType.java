public enum PlaneType {
    BOEING747(20, 200),
    BOEING777(10, 100);
    private final int capacity, weight;


    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
