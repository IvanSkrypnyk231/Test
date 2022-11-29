package task;

import java.util.ArrayDeque;
import java.util.Deque;
public class MyStack<E> implements MyStackInterface<E> {

    private final Deque<E> stack = new ArrayDeque<>();


    @Override
    public void pushElement(E obj) { // метод додавання в початок стеку
        stack.addFirst(obj);
    }

    // по аналогії
    @Override
    public E popElement() {
        if (stack.isEmpty()) return null;
        return stack.removeFirst();
    }

    @Override
    public E peekElement() {
        if (stack.isEmpty()) return null;
        return stack.getFirst();
    }

}


