package patterns.BuilderPattern;

public class Builder {

    String ram;
    String hdd;
    boolean isBlueToothEnabled;
    boolean isGraphicsCardEnabled;

    Builder(String ram, String hdd) {
        this.ram = ram;
        this.hdd = hdd;

    }

    public Builder isBlueToothEnabled(boolean isBlueToothEnabled) {
        this.isBlueToothEnabled = isBlueToothEnabled;
        return this;
    }

    public Builder isGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
        return this;
    }

    public Computer build() {
        return new Computer(this);

    }

}
