package patterns.BuilderPattern;

public class ClientProgram {

    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .isBlueToothEnabled(true)
                .isGraphicsCardEnabled(false)
                .build();

        System.out.println(computer);

    }
}
