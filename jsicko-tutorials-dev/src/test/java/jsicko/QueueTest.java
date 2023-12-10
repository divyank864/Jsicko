package jsicko;

import java.util.Iterator;
import java.util.NoSuchElementException;

import ch.usi.si.codelounge.jsicko.Contract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class QueueTest {
    // size


    @Test
    public void iteratorTest() throws Throwable {
        final ContractedQueue<Integer> q = new ContractedQueue<>();
        
        for (int i=1; i<=5; i++) {
            q.add(i);
        }

        Iterator<Integer> itr = q.iterator();
        assertEquals(1, itr.next());
        assertEquals(2, itr.next());
        assertEquals(3, itr.next());
        assertEquals(4, itr.next());
        assertEquals(5, itr.next());
        assertThrows(NoSuchElementException.class, () -> itr.next());
    }
    
    // peek
    // TODO
    @Test
    public void peekOnEmptyListTest() throws Throwable {
        // TODO
    }

    @Test
    public void peekTest() throws Throwable {
        // TODO
    }

    
    // add
    @Test
    public void addOnEmptyListTest() throws Throwable {
        // TODO
    }

    @Test
    public void addTest() throws Throwable {
        final ContractedQueue<Integer> list = new ContractedQueue<>();
        assertTrue(list.add(42));
        assertEquals(42, list.element()); 
    }

    // remove
    // TODO
    @Test
    public void removeOnEmptyListTest() throws Throwable {
        // TODO
    }

    @Test
    public void removeTest() throws Throwable {
        // TODO
    }

    // poll
    // TODO
    @Test
    public void pollOnEmptyListTest() throws Throwable {
        // TODO
    }

    @Test
    public void pollTest() throws Throwable {
        // TODO
    }


    // TODO
    @Test
    public void containsOnEmptyListTest() throws Throwable {
        // TODO
    }

    @Test
    public void containsTest() throws Throwable {
        // TODO
    }
}
