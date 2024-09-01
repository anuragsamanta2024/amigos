package patterns.BuilderPattern;

public class Computer {

    private String ram;
    private String hdd;
    private boolean isBlueToothEnabled;
    private boolean isGraphicsCardEnabled;

    Computer(Builder builder) {
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.isBlueToothEnabled = builder.isBlueToothEnabled;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", isBlueToothEnabled=" + isBlueToothEnabled +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                '}';
    }

    static Builder builder() {
        return new Builder("4gb", "64gb");
    }
}
