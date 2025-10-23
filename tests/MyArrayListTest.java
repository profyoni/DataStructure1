import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MyArrayListTest {
    private MyArrayList<String> stringList = new MyArrayList<>();

    @Test
    public void size()
    {
        Assertions.assertEquals(0,stringList.size());
    }
    @Test
    public void add()
    {

        // Act
        stringList.add("A");
        stringList.add("B");

        int size = stringList.size();
        // Assert
        Assertions.assertEquals(2, size);
    }

    @Test
    public void add11()
    {
        // Act
        for (int i = 0; i < 1100; i++)
        {
            stringList.add("A" + i);
        }

        int size = stringList.size();
        // Assert
        Assertions.assertEquals(1100, size);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
    }

    @Test
    public void languageTest(){
        stringList.add("A");
        stringList.add("B");
        String concat = "";
        for(String str : stringList)
            concat += str;
//        Iterator it = list.iterator();
//        while (it.hasNext())
//        {
//            concat += it.next();
//        }


        Assertions.assertEquals(concat,"AB");
    }

    @Test
    public void addAll(){
        ArrayList<String> al = new ArrayList<>();
        al.add("A");

        HashSet<String> s1 = new HashSet<>();
        s1.add("A");

        stringList.addAll(al);
        stringList.addAll(s1);
    }
}
