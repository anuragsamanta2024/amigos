package Exercise.composition;

public class Employee {
    private long id;
    private String name;
    private Address address;

    Employee(long id, String name, String city, String state) {
        this.id = id;
        this.name = name;
        this.address = new Address(city, state);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public static class Address {

        final private String city;
        final private String state;

        Address(String city, String state) {
            this.city = city;
            this.state = state;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    '}';
        }
    }
}
