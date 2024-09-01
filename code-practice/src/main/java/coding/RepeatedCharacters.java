package coding;

public class RepeatedCharacters {

    public static void main(String[] args) {
        String s = "aaaabbbcca";
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(s.charAt(i) + "" + count);
                count = 1;
            }
        }
        System.out.print(s.charAt(s.length() - 1) + "" + count);
    }
}
