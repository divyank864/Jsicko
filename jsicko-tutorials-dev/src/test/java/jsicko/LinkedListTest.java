package jsicko;

import ch.usi.si.codelounge.jsicko.Contract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LinkedListTest {
    // indexOf

    @Test
    public void indexOfTest() throws Throwable {
        final ContractedLinkedList<Integer> list = new ContractedLinkedList<>();
        list.add(42);
        assertEquals(0, list.indexOf(42));
    }


    // get

    @Test
    public void getOnEmptyListTest() throws Throwable {
        final ContractedLinkedList<Integer> list = new ContractedLinkedList<>();
        assertThrows(Contract.PreconditionViolation.class, () -> list.get(-1)); 
        assertThrows(Contract.PreconditionViolation.class, () -> list.get(0)); 
        assertThrows(Contract.PreconditionViolation.class, () -> list.get(42));
    }

    @Test
    public void getFirstOnEmptyListTest() throws Throwable {
        final ContractedLinkedList<Integer> list = new ContractedLinkedList<>();
        assertThrows(Contract.PreconditionViolation.class, () -> list.getFirst());
        list.add(42);
        assertDoesNotThrow(() -> list.getFirst());
        list.remove();
        assertThrows(Contract.PreconditionViolation.class, () -> list.getFirst());
    }
    
    @Test
    public void getLastOnEmptyListTest() throws Throwable {
        final ContractedLinkedList<Integer> list = new ContractedLinkedList<>();
        assertThrows(Contract.PreconditionViolation.class, () -> list.getLast());
        list.add(42);
        assertDoesNotThrow(() -> list.getLast());
        list.remove();
        assertThrows(Contract.PreconditionViolation.class, () -> list.getLast());
    }

    @Test
    public void getTest() throws Throwable {
        final ContractedLinkedList<Integer> list = new ContractedLinkedList<>();
        list.add(42);
        assertEquals(42, list.get(0)); 
        list.add(69);
        assertEquals(69, list.get(1)); 
        assertThrows(Contract.PreconditionViolation.class, () -> list.get(42));
    }

    @Test
    public void getFirstTest() throws Throwable {
        final ContractedLinkedList<Integer> list = new ContractedLinkedList<>();
        assertThrows(Contract.PreconditionViolation.class, () -> list.getFirst());
        list.addFirst(42);
        assertEquals(42, list.getFirst());
        list.addFirst(420);
        assertEquals(420, list.getFirst());
    }

    @Test
    public void getLastTest() throws Throwable {
        final ContractedLinkedList<Integer> list = new ContractedLinkedList<>();
        assertThrows(Contract.PreconditionViolation.class, () -> list.getLast());
        list.addLast(42);
        assertEquals(42, list.getLast());
        list.addLast(420);
        assertEquals(420, list.getLast());
    }
}
