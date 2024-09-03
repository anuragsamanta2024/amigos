package Java9;

public class Resource implements AutoCloseable {

    Resource() {
        System.out.println("Creating external resources");
    }

    void op1() {
        System.out.println("op1");
    }

    /*
    void finalise(){
     System.out.println("Cleaning external resources");
    */

    @Override
    public void close() {

        System.out.println("Cleaning external resources");
    }


    public static void main(String[] args) throws Exception {

        /*
        Resource resource = new Resource();
        resource.op1();
        */

        try (Resource resource = new Resource()) {
            resource.op1();
        }

    }


}

/*
    Garbage Collection :-
    1.Memory we use at runtime
    2.External resources we use

    Finalize method is not called because if your program uses a lot of memory, GC may not be called,
    hence it may not know to call finalize method

    in Java9 , finalize() is deprecated

*/
