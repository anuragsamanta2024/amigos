package coding;

public class DisplayNonRepeat {

    public static void main(String[] args) {

        String str = "apple";
        int i = 0;
        int j = 1;
        String newString = "";
        while (j < str.length()) {
            if (str.charAt(i) == str.charAt(j)) {
                j = j + 2;
                i = i + 2;

            } else if (str.charAt(i) != str.charAt(j) || j == str.length() - 1) {
                newString = newString + str.charAt(i);
                i = j;
                j = j + 1;
            }
        }
        newString = newString + str.charAt(j-1);
        System.out.print(newString);

    }

}

