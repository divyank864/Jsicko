package jsicko;

import java.util.LinkedList;
import java.util.Deque;

public class ContractedDeque<E> extends ContractedQueue<E> implements CDeque<E> {
    private Deque<E> baseObject = new LinkedList<E>();

    // get
    
    @Override
    public E getFirst() {
        return baseObject.getFirst();
    }

    @Override
    public E getLast() {
        return baseObject.getLast();
    }

    // add

    @Override
    public void addFirst(E e) {
        baseObject.addFirst(e);
    }

    @Override
    public void addLast(E e) {
        baseObject.addLast(e);
    }

    // peek

    @Override
    public E peekFirst() {
        return baseObject.peekFirst();
    }

    @Override
    public E peekLast() {
        return baseObject.peekLast();
    }


    // remove

    @Override
    public E removeFirst() {
        return baseObject.removeFirst();
    }

    @Override
    public E removeLast() {
        return baseObject.removeLast();
    }
    
}
