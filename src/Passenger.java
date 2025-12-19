public class Passenger {
    private int id;
    private static int id_gen = 1;
    private String first_name;
    private String last_name;
    private int age;
    private boolean gender;

    Passenger(){
        id = id_gen++;
    }
    Passenger(String first_name, String last_name, int age, boolean gender){
        this();
    }

    public int getId() {
        return id;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void getGender() {
        this.gender = gender;
    }
}
