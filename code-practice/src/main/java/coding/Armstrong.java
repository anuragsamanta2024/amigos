package coding;


public class Armstrong {

    public static void main(String[] args) {
        System.out.println("Is Armstrong Number : " + isArmstrongNumberByJava8(371));

    }

    private static boolean isArmstrongNumberByJava8(int n) {
        int len = String.valueOf(n).length();
        int sum = String.valueOf(n).chars()
                .map(each -> Character.digit(each, 10))
                .map(each -> (int) Math.pow(each, len))
                .sum();
        return sum == n;
    }


}

