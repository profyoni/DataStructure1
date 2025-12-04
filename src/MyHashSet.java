import java.util.*;

public class MyHashSet<T> implements Set<T> {

    private List<T>[] hashTable;
    private int size;
    public MyHashSet(){
        hashTable = (LinkedList<T>[]) new LinkedList[10];
    }
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
        int hc = o.hashCode();
        if (hc >= hashTable.length) {
            hc = hc % hashTable.length;
        }
        if (hashTable[hc] == null) {
            return false;
        }
        return hashTable[hc].contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        if (contains(t)) {
            return false;
        }
        int hc = t.hashCode();
        if (hc >= hashTable.length) {
            hc = hc % hashTable.length;
        }
        if (hashTable[hc] == null) {
            hashTable[hc] = new LinkedList<>();
        }
        hashTable[hc].add( t );
        return true;
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
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
