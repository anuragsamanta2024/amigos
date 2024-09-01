package interfaces.interface1.defaults;

interface Test1 {

    void m1();

    default void m2() {
        System.out.println("default implementation of m2");
    }
}


class Test implements Test1 {

    public static void main(String[] args) {

        new Test().m2();
    }

    @Override
    public void m1() {

    }

//    public void m2() {
//        System.out.println("overridden implementation of m2");
//    }
}

class Demo implements Test1 {

    @Override
    public void m1() {

    }
}

