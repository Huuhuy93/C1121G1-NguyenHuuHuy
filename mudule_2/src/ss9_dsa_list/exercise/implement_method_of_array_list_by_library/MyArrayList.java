package ss9_dsa_list.exercise.implement_method_of_array_list_by_library;

import java.util.Arrays;

public class MyArrayList<E> {
    //    Số lượng phần tửa có trong MyArrayList
    private int size = 0;
    //    Sức chứa của MyArrayList
    private final int DEFAUT_CAPACITY = 10;
    //    Mảng chứa các phần tử
    Object elements[];

    //    Sức chứa mặc định khi khởi tạo bằng constructor không có tham số
    public MyArrayList() {
        elements = new Object[DEFAUT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity: " + capacity);
        }
    }

//    phương thức trả về số lượng phần tử
    public int size() {
        return this.size;
    }

//    phương thức clear ArrayList
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

//    Phương thức add 1 phần tử vào MyArrayList
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(6);
        }
        elements[size] = element;
        size ++;
        return true;
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: "+index);
        } else if (elements.length == size){
            ensureCapacity(6);
        }

        if (elements[index] == null) {
            elements[index] = element;
            size ++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i-1];
            }
        }
    }

//    Phương thức tăng kích thước của MyArrayList
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("min Capacity: "+minCapacity);
        }
    }

//    Phương thức lấy 1 element

    public E get(int index) {
        return (E) elements[index];
    }

//    Phương thức lấy index của 1 phần tử
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

//    Phương thức kiểm tra 1 element có nằm trong arrayList không ???
    public boolean contains(E element) {
        return this.indexOf(element) >=0;
    }

//    Phương thức tạo ra 1 bản sao của phương thức hiện tại
    public MyArrayList<E> clone() {
        MyArrayList<E> v = new MyArrayList<>();
        v.size = this.size;
        return v;
    }
    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i+1];
        }
        elements[size-1] = null;
        size --;
        return element;
    }

}
