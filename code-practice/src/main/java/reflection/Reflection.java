package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<?> aClass = Class.forName("random.ReOccurrence");
        Method method = aClass.getDeclaredMethod("findOccurrence", String.class);
        method.invoke("BCADA","Hello");
    }
}
