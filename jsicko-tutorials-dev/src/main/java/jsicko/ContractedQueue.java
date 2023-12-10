package jsicko;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ContractedQueue<E> implements CQueue<E> {
    private Queue<E> baseObject = new LinkedList<E>();

    // size
    
    @Override
    public int size() {
        return baseObject.size();
    }

    // add

    @Override
    public boolean add(E e) {
        return baseObject.add(e);
    }

    // peek

    @Override
    public E peek() {
        return baseObject.peek();
    }

    // element

    @Override
    public E element() {
        return baseObject.element();
    }


    // remove

    @Override
    public boolean remove(E e) {
        return baseObject.remove(e);
    }

    @Override
    public E remove() {
        return baseObject.remove();
    }

    // poll

    @Override
    public E poll() {
        return baseObject.poll();
    }

    // contains 
    
    @Override
    public boolean contains(E e) {
        return baseObject.contains(e);
    }

    @Override
    public Iterator<E> iterator() {
        return baseObject.iterator();
    }
}
