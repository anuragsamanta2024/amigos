package java8.pratice;

public class SeparateArrays {

    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 1, 0, 1, 0};
        int length = arr.length;
        segregate0and1(arr, length);
        print(arr, length);
    }

    private static void segregate0and1(int[] arr, int length) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i] = 0;

        }
        for (int i = count; i < length; i++) {
            arr[i] = 1;
        }
    }

    private static void print(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
