package Exercise.composition.codeResuse;

class Driver {
    void drive() {

    }
}

class Car {

    private Driver driver;

    void drive() {
        driver.drive();
    }
}

class Bicycle {
    private Driver driver;

    void drive() {
        driver.drive();
    }
}
