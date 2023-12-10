package jsicko;

import static ch.usi.si.codelounge.jsicko.Contract.*;
import static ch.usi.si.codelounge.jsicko.ContractUtils.*;

public interface CDeque<E> extends CQueue<E> {
    
    // ** Invariants ** //


    // ** Inherited methods ** //

    @Requires("is_not_empty")
    @Ensures("returns_first_element")
    @Pure
    E getFirst();

    @Requires("is_not_empty")
    @Ensures("returns_last_element")
    @Pure
    E getLast();

    @Ensures({"size_increases", "element_added_first"})
    void addFirst(E e);
    
    @Ensures({"size_increases", "element_added_last"})
    void addLast(E e);

    @Ensures("returns_first_element")
    @Pure
    E peekFirst();

    @Ensures("returns_last_element")
    @Pure
    E peekLast();
    
    // TODO
    E removeFirst();

    E removeLast();


    // ** Preconditions and postconditions ** //

    @Pure
    default boolean returns_last_element(E returns) {
        return returns.equals(getNthElement(size()-1));
    }
    
    @Pure
    default boolean element_added_first(E e) {
        return getNthElement(0).equals(e);
    }
}
