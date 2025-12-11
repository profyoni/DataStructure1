import java.util.*;

public class MyHashMap<K,V> implements Map<K,V> {

    private static class Entry<K,V>{
        K key;
        V v;
    }

    private int size = 0;
    private LinkedList<Entry<K,V>>[] hashTable = new LinkedList[16];
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        int hc = key.hashCode();
        int index = Math.abs(hc % hashTable.length);
        LinkedList<Entry<K,V>> bucket = hashTable[index];
        if (bucket == null) {
            return null;// TODO throw exception
        }
        for (Entry<K,V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.v;
            }
        }
        return null; // TODO
    }

    @Override
    public V put(K key, V value) {
        int hc = key.hashCode();
        int index = Math.abs(hc % hashTable.length);
        LinkedList<Entry<K,V>> bucket = hashTable[index];
        if (bucket == null) {
            bucket = new LinkedList<>();
        }
        Entry<K,V> entry = new Entry<>();
        entry.key = key;
        entry.v = value;
        bucket.add(entry);
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return Set.of();
    }

    @Override
    public Collection<V> values() {
        return List.of();
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return Set.of();
    }
}
