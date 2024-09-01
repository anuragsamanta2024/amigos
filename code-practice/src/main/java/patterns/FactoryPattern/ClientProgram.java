package patterns.FactoryPattern;

public class ClientProgram {

    public static void main(String[] args) {

        Logistics logistics = Factory.getTypeOfLogistics("Road");
        logistics.getLogistics();

    }
}
