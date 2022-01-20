package ss15_handle_exception_and_debug.practice.array_index_out_of_bounds_exception;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Random;

public class ArrayIndexOutOfBoundsException {
    public Integer[] creatRandom() {
        Random random = new Random();
        Integer[] array = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i]+" ");
        }
        return array;
    }
}
