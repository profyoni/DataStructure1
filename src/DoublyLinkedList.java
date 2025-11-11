import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

    class Node2{
        String data;
        Node2 prev, next;

        public Node2(String d, Node2 p, Node2 n){
            data = d;
            prev = p;
            next = n;
        }
    }

    public class DoublyLinkedList implements List<String> {

        public DoublyLinkedList() {
            head = new Node2(null,null,null);
            tail = new Node2(null, head, null);
            head.next = tail;
        }
        private Node2 head, tail;
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
            return false;
        }

        @Override
        public Iterator<String> iterator() {
            return null;
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

}