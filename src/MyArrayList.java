import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

enum Gender {OTHER, MALE, FEMALE}
class Person{
    public Person(String firstName, String lastName, int age, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    private String firstName, lastName;
    private Number age;
    private Gender gender;

}

public class MyArrayList<T> implements List<T> {

    private T [] backingStore = (T []) new Object[10];
    private int insertionPoint = 0;

    @Override
    public int size() {
        return insertionPoint;
    }

    @Override
    public boolean isEmpty() {
        return insertionPoint == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
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
    public boolean add(T s) {
        if (insertionPoint >= backingStore.length)
            growBackingStore();
        backingStore[insertionPoint] = s;
        insertionPoint++;
        return true;
    }

    private void growBackingStore() {
        T[] newBackingStore = (T []) new Object[backingStore.length * 2 + 1];
        for (int i = 0; i < backingStore.length; i++)
            newBackingStore[i] = backingStore[i];

        backingStore = newBackingStore;
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
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
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
        insertionPoint = 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        return backingStore[index];
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    private class MyIterator implements Iterator<T> {

        private int beforeIndex = 0;
        @Override
        public boolean hasNext() {
            return beforeIndex < size();
        }

        @Override
        public T next() {
            return backingStore[beforeIndex++];
        }
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return List.of();
    }// concrete class = instantiable{

}
