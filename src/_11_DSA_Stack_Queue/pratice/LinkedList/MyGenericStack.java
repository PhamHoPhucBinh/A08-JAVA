package _11_DSA_Stack_Queue.pratice.LinkedList;

import java.util.EmptyStackException;
import java.util.LinkedList;

import static javafx.beans.binding.Bindings.isEmpty;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList<>();
    }
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public void push(T element){
        stack.addFirst(element);
    }

    private boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}

