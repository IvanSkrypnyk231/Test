package task;

public interface MyStackInterface<E> {
    void pushElement(E obj);
    E popElement();
    E peekElement();
}