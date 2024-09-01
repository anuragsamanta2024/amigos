package immutables;

public class Address {
    String city;
    String state;

    public Address(String city, String state) {
        this.city=city;
        this.state=state;
    }

    public Address(Address address){
        this(address.getCity(), address.getState());
    }
    public static Address getInstance(Address address){
        return new Address(address.getCity(), address.getState());
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
}
