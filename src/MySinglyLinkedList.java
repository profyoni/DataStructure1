import java.util.*;



public class MySinglyLinkedList implements List<String> {

    private static class Node{
        String data;
        Node next;
    }

    private Node head = new Node(); // dummy node
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        for( String s : this)
        {
            if(Objects.equals(s,o))
                return true;
        }
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyLLIterator();
    }

    private class MyLLIterator implements Iterator<String> {
        private Node current = MySinglyLinkedList.this.head;

        @Override
        public boolean hasNext() {
            return this.current.next != null;
        }

        @Override
        public String next() {
            this.current = current.next;
            return this.current.data;
        }
    }
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String s) {
        Node newNode = new Node();
        newNode.data = s;
        size++;
        if (head == null) { // first elt
            head = newNode;
        }
        else {
            Node tail = getTail();
            tail.next = newNode;
        }
        return true;
    }

    private Node getTail() {
        Node current = head;
        if (head == null)
            return null;
        while (current.next != null)
            current = current.next;
        return current;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    private Node getNode(int index, boolean inclusive) {
        checkBounds(index, inclusive);
        int currentIndex = 0;
        Node current = head;
        while (currentIndex++ < index)
            current = current.next;
        return current;
    }

    private void checkBounds(int index, boolean inclusive) {
        if (index < 0 || index > size || (!inclusive && index == size))
            throw new IndexOutOfBoundsException(String.format("Index: %d, Size: %d", index, size));
    }

    @Override
    public String get(int index) {
        return getNode(index, false).data;
    }

    @Override
    public String set(int index, String element) {
        Node current = getNode(index, false);

        String oldVal = current.data;
        current.data = element;
        return oldVal;
    }

    @Override
    public void add(int index, String element) {
        Node newNode = new Node();
        newNode.data = element;
        size++;
        if (index == 0)
        {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node prev = getNode(index - 1, true);

        newNode.next = prev.next;
        prev.next = newNode;

    }

    @Override
    public String remove(int index) {

        return "";
    }

    @Override
    public int indexOf(Object o) {
        int i=0;
        for (String s : this)
        {
            if (Objects.equals(s,o))
                return i;
            i++;
        }
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
