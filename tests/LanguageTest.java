import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class LanguageTest {

    public static class Person2 {
        public String name;
        public int id;
        public boolean isFemale;


        @Override
        public int hashCode() {
            return Objects.hash(name, id, isFemale, "");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person2 person2 = (Person2) o;
            return id == person2.id && isFemale == person2.isFemale && Objects.equals(name, person2.name);
        }
    }

    @Test
    public void testBadHashCode(){
        Person2 p1 = new Person2();
        Person2 p2 = new Person2();
        p1.name = "Bob";
        p2.name = "Bob";

        Set<LanguageTest.Person2> set = new HashSet<>();
        set.add(p1);

        Assertions.assertTrue(p1.equals(p2));
        boolean containsBob = set.contains(p2);
        Assertions.assertTrue(containsBob);

    }
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
