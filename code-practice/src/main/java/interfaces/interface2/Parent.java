package interfaces.interface2;
 interface Parent {

    void print(String message);
}

interface Child extends Parent {
    void hello();
}
