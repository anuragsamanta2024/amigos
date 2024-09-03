package Java9;

public interface Sample {
    /*

    From Java 9 onwards, interface can have private methods and private static methods

     */

    default int getNumberOfCores1(){
        return getCount1();
    }

    static int getNumberOfCores2(){
        return getCount2();

    }

    private int getCount1(){
        return 4;
    }
    private static int getCount2(){
        return 4;
    }
}
