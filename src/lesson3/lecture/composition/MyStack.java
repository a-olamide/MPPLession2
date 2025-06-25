package lesson3.lecture.composition;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
    private List<T> list = new ArrayList<T>();
    private int stackPointer = -1;
    public void push(T item) {
        list.add(++stackPointer, item);
    }
    public T pop() {
        return list.remove(stackPointer--);
    }
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();

    }

}
