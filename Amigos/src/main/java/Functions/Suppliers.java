package Functions;

import java.util.List;
import java.util.function.Supplier;

public class Suppliers {

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static Supplier<List<String>> getDBConnectionUrlSupplier = () -> List.of(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:5432/customers");

}
