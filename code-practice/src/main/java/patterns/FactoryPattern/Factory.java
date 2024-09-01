package patterns.FactoryPattern;

public class Factory {

    public static Logistics getTypeOfLogistics(String input) {
        if (input.equalsIgnoreCase("Sea")) {
            return new SeaLogistics();
        } else {
            return new RoadLogistics();
        }
    }
}
