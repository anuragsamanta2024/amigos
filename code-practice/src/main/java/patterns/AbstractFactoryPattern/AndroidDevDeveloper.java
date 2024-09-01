package patterns.AbstractFactoryPattern;

import interfaces.interface3.Employee;

public class AndroidDevDeveloper extends AbstractEmployeeFactory {
    @Override
    public Employee getEmployee() {
       // return new AndroidDeveloper();
    return null;
    }
}
