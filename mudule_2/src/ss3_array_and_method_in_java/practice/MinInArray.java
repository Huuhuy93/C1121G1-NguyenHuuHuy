package ss3_array_and_method_in_java.practice;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {0, 12, 7, 8, 8, 6, 1};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index] + " at postition " + index);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
