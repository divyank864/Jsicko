package jsicko;

import java.util.LinkedList;

public class ContractedLinkedList<E> extends ContractedDeque<E> implements CLinkedList<E> {
    private LinkedList<E> baseObject = new LinkedList<E>();

    // index

    @Override
    public int indexOf(E e) {
        return baseObject.indexOf(e);
    }

    // get

    @Override
    public E get(int index) {
        return baseObject.get(index);
    }


    // remove

    @Override
    public E remove(int index) {
        return baseObject.remove(index);
    }
}
