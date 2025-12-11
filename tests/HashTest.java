import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashTest {
    private MyHashMap<String, Integer> map = new MyHashMap<>();
    @Test
    public void put(){
        map.put("A", 15);
        int age = map.get("A");
        Assertions.assertEquals(15, age);
    }
}
