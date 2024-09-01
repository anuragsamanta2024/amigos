package patterns.AbstractFactoryPattern;

import interfaces.interface3.Employee;

public class WebDevDeveloper extends AbstractEmployeeFactory{
    @Override
    public Employee getEmployee() {
     //   return new WebDeveloper();
        return null;
    }
}
