import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;

public class LanguageTest {
    @Test
    public void t1(){
        int x = 5;
        int y = x << 2;
        Assertions.assertEquals(20,y);
    }

    @Test
    public void t2(){
        int x = 50;
        int y = x >> 2;
        Assertions.assertEquals(12,y);
    }

    @Test
    public void t3(){
        HashSet<String> set = new HashSet<>();

        boolean firstAdd = set.add("Z");
        Assertions.assertTrue(firstAdd);
        set.add("B");
        set.add("C");
        boolean _2ndAdd = set.add("Z");
        Assertions.assertEquals(3, set.size());

        Assertions.assertTrue(! _2ndAdd);
        Assertions.assertNotEquals("Z", set.iterator().next());
    }


    @Test
    public void t4(){
        // reverse telephone lookup
        String tel1 = "5551212", tel2 = "1234567";
        Person bob = new Person("Bob", "B",   66, Gender.MALE);
        Person abe = new Person("Abe", "A", 65, Gender.MALE);

        HashMap<String, Person> map = new HashMap<>(); // the key is a String, the value is a Person
        map.put(tel1, bob);
        map.put(tel2, abe);

        Assertions.assertEquals(2, map.size());

        Assertions.assertEquals(bob, map.get(tel1));
        Assertions.assertEquals(abe, map.get(tel2));
    }


}
