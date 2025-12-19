public enum BusSize {
    SMALL(20),
    MEDIUM(40),
    LARGE(60);

    private final int capacity;

    BusSize(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

