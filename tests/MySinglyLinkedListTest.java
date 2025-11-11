import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySinglyLinkedListTest {
    private List<String> list = new MySinglyLinkedList();
    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void contains() {
    }

    @Test
    void add() {
        list.add("a");
        list.add("b");
        list.add("c");

        assertEquals(3, list.size());
    }
    @Test
    void add2() {
        list.add(0,"a");
        list.add(1,"b");
        list.add(1,"c");

        assertEquals(3, list.size());
        assertEquals("a", list.get(0));
        assertEquals("c", list.get(1));
        assertEquals("b", list.get(2));
    }

    @Test
    void clear() {
        list.add("a");
        list.add("b");
        assertEquals(2, list.size());
        list.clear();
        assertEquals(0, list.size());

    }

    @Test
    void get() {
        list.add("a");
        list.add("b");

        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    void set() {
        list.add("a");
        list.add("b");

        assertEquals( "a",list.set(0, "c"));
        list.set(1, "d");

        assertEquals("c", list.get(0));
        assertEquals("d", list.get(1));
    }
}