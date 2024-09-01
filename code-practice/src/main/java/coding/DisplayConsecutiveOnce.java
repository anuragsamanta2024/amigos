package coding;

public class DisplayConsecutiveOnce {

    public static void main(String[] args) {
        String s = "aabccba";
        int i = 0;
        int j = 0;
        String newString = "";
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            } else if (s.charAt(i) != s.charAt(j) || j == s.length() - 1) {
                newString = newString + (s.charAt(i));
                i = j;
                j++;
            }

        }
        newString = newString + s.charAt(j - 1);
        System.out.print(newString);
    }
}
