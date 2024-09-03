package Exercise.composition.diamondProblem;

class CanFly {
    void fly() {

    }
}

class Bird extends CanFly {
    void fly() {
        System.out.println("Bird Can Fly");
    }
}

class Airplane extends CanFly {
    void fly() {
        System.out.println("Airplane Can Fly");
    }
}

class FylingObject {
    CanFly canFly;

    FylingObject(CanFly canFly) {
        this.canFly = canFly;
    }

    void fly() {
        canFly.fly();
    }

}


