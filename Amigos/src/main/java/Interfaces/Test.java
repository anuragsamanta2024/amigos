package Interfaces;

import java.util.List;

public class Test {
    public static void main(String[] args) {

        ConsumerInterfaceExample<String> consumerInterfaceExample = System.out::println;
        consumerInterfaceExample.print("Hello Consumer Interface");


        SupplierInterfaceExample<List<String>> supplierInterfaceExample = () -> List.of(
                "jdbc://localhost:5432/users",
                "jdbc://localhost:5432/customers");

        System.out.println(supplierInterfaceExample.getDbURLConnections());
    }

}
