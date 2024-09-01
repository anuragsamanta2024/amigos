package serialization;

import java.io.*;

public class MainClass {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee employee = new Employee(1, "John");
        Employee emp = null;

        //Serialization
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Downloads");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Success");

        //De-Serialization

        FileInputStream fileInputStream = new FileInputStream("C:\\Downloads");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        emp = (Employee) objectInputStream.readObject();
        System.out.println(emp.getId());
        System.out.println(emp.getName());
    }
}
