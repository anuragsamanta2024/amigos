package interfaces.interface2;

class Test implements Test1, Test2 {

    public static void main(String[] args) {
        System.out.println(Test1.value);
        System.out.println(Test2.value);
        new Test().m1();
    }
    @Override
    public void m1() {
        System.out.println("inside m1 of Test");
    }
}

interface Test1 {

    int value = 1;

    void m1();


}

interface Test2 {

    int value = 2;

    void m1();


}
