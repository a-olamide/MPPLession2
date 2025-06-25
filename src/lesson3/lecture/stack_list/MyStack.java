package lesson3.lecture.stack_list;

import java.util.ArrayList;
import java.util.Stack;

public class MyStack<T> extends ArrayList<T> {
    private int stackPointer = -1;

    public void push(T element) {
        add(++stackPointer, element);
    }

    public T pop() {
        T removedData = remove(stackPointer);
        stackPointer--;
        return removedData;
    }
    //if you don't include this, your clear will not work well. Ththis is a hint you can't say Stack is-a List
    @Override
    public void clear() {
        super.clear();
        stackPointer = -1;
    }
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Status: " + stack);
        System.out.println("stack.pop()");
        System.out.println("Status: " + stack);
        stack.clear(); //this will not reset stackPointer, this is wy we should not use Stack as a subclass of ArrayList as we have to
        //re-implentn clear again


    }

}
