package opgave01.models;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListStack<E> implements StackEaaa<E> {
    ArrayList<E> List = new ArrayList<>();

    @Override
    public void push(E element) {
        List.add(element);

    }

    @Override
    public E pop() {
        if (List.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        } else
            return List.removeLast();
    }

    @Override
    public E peek() {
        if (List.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        } else
            return List.getLast();

    }

    @Override
    public boolean isEmpty() {
        return List.isEmpty();
    }

    @Override
    public void clear() {
        List.clear();
    }

    @Override
    public int size() {
        return List.size();
    }
}
