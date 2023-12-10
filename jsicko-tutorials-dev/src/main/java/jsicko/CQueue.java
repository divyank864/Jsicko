package jsicko;

import ch.usi.si.codelounge.jsicko.Contract;

import static ch.usi.si.codelounge.jsicko.Contract.*;
import static ch.usi.si.codelounge.jsicko.ContractUtils.*;

import java.util.Iterator;
import java.util.NoSuchElementException;


public interface CQueue<E> extends Contract {
    
    // ** Invariants ** //
    @Invariant
    @Pure
    default boolean size_is_non_negative() {
        return size() >= 0;
    }
    
    @Invariant
    @Pure
    default boolean not_null() {
        return this != null;
    }


    // ** Inherited methods ** //
    
    @Ensures("returns_non_negative")
    @Pure
    int size();

    @Pure
    Iterator<E> iterator();

    @Ensures({"returns_first_element"})
    @Pure
    E peek();

    @Requires("is_not_empty") // NoSuchElementException
    @Ensures({"returns_first_element"})
    @Pure
    E element();

    @Ensures({"size_increases", "element_added_last"})
    boolean add(E e);

    @Ensures({"size_decreases"})
    boolean remove(E e);

    @Requires("is_not_empty") // NoSuchElementException
    @Ensures({"size_decreases"})
    E remove();

    @Pure
    boolean contains(E e);

    @Pure
    E poll();

    // ** Preconditions and postconditions ** //
    // size
    @Pure
    default boolean is_empty() {
        return size() == 0;
    }

    @Pure
    default boolean is_not_empty() {
        return size() > 0;
    }
    
    @Pure
    default boolean is_within_bounds(int index) {
        return 0 <= index && index < size();
    }

    @Pure
    default boolean size_increases() {
        return size() == old(this).size() + 1;
    }

    @Pure
    default boolean size_decreases() {
        return size() == old(this).size() - 1;
    }

    @Pure
    default boolean returns_non_negative(int returns) {
        return returns >= 0;
    }


    // elements

    @Pure
    default boolean element_is_not_null(E e) {
        return e != null;
    }

    @Pure
    default boolean returns_first_element(E returns) {
        return returns.equals(getNthElement(0));
    }
    
    @Pure
    default boolean element_added_last(E e) {
        return getNthElement(size()-1).equals(e);
    }

    // fetches nth element using iterator
    @Pure
    default E getNthElement(int index) throws NoSuchElementException {
        Iterator<E> iterator = iterator();
    
        for (int i = 0; i < index; i++) {
            if (iterator.hasNext())
                iterator.next();
        }
        return iterator.next();
    }
}
