package jsicko;

import static ch.usi.si.codelounge.jsicko.Contract.*;
import static ch.usi.si.codelounge.jsicko.ContractUtils.*;

public interface CLinkedList<E> extends CDeque<E> {
    
    // ** Invariants ** //


    // ** Inherited methods ** //

    // indexOf

    @Pure
    int indexOf(E e);

    // get

    @Requires({"is_within_bounds", "is_not_empty"})
    @Ensures("returns_nth_element")
    @Pure
    E get(int index);    

    // remove

    E remove(int index);

    // ** Preconditions and postconditions ** //

    @Pure
    default boolean returns_nth_element(E returns, int index) {
        return implies(is_within_bounds(index), () -> index == indexOf(returns));
    }
}
