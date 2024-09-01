package string;

public class StringBufferExample {

    public static void main(String[] args) {

        StringBuffer name = new StringBuffer("Mike");
        StringBuffer nameWithSurname = name.append("Ross");

        System.out.println(name.hashCode() == nameWithSurname.hashCode());

    }
}
