import java.util.*;

class MySetEvil<T> extends ArrayList<T>
{
    public boolean add(T t){
        if (! contains(t)){
            super.add(t);
            return true;
        }
        return false;
    }
}

public class MySet<T> implements Set<T> {
    private List<T> bs = new ArrayList<T>();
    @Override
    public int size() {
        return bs.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return bs.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return bs.iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return bs.toArray(a);
    }

    @Override
    public boolean add(T t) {
        if (!contains(t)) {
            bs.add(t);
            return true;
        }
        return false;
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
