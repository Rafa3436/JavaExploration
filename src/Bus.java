public class Bus {
    private int id;
    private static int id_gen = 1;
    private BusSize bus_size; // small, medium or large
    private BusNumber bus_number; // 12, 21, 26, 46, 54
    private String state_number; // "KZ555RRR01"
    private int mileage; // probeg in kilo

    Bus(){
        id = id_gen++;
    }
    Bus(BusSize bus_size, BusNumber bus_number, String state_number, int mileage){
        this();
        setBusSize(bus_size);
        setBusNumber(bus_number);
        setState_number(state_number);
        setMileage(mileage);
    }

    public int getId() {
        return id;
    }

    public void setState_number(String state_number) {
        this.state_number = state_number;
    }

    public String getState_number() {
        return state_number;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public void setBusSize(BusSize bus_size) { this.bus_size = bus_size; }

    public BusSize getBus_size() {
        return bus_size;
    }

    public void setBusNumber(BusNumber bus_number) { this.bus_number = bus_number; }

    public BusNumber getBusNumber(){
        return bus_number;
    }

    public void getBusFullInfo() {
        System.out.println("id = " + getId() + "; ");
        System.out.println("bus size = " + getBus_size() + "; ");
        System.out.println("bus number = " + getBusNumber() + "; ");
        System.out.println("bus state number = " + getState_number() + "; ");
        System.out.println("bus mileage = " + getMileage() + "; ");
    }
}
