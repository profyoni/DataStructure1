import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayListTest {
    @Test
    public void size()
    {
        MyArrayList list = new MyArrayList();

        Assertions.assertEquals(0,list.size());
    }
    @Test
    public void add()
    {
        // Arrange
        MyArrayList list = new MyArrayList();

        // Act
        list.add("A");
        list.add("B");

        int size = list.size();
        // Assert
        Assertions.assertEquals(2, size);
    }

    @Test
    public void add11()
    {
        // Arrange
        MyArrayList list = new MyArrayList();

        // Act
        for (int i = 0; i < 1100; i++)
        {
            list.add("A" + i);
        }

        int size = list.size();
        // Assert
        Assertions.assertEquals(1100, size);
    }

    @Test
    public void languageTest(){
        MyArrayList list = new MyArrayList();
        list.add("A");
        list.add("B");
        String concat = "";
        for(String str : list)
            concat += str;
//        Iterator it = list.iterator();
//        while (it.hasNext())
//        {
//            concat += it.next();
//        }


        Assertions.assertEquals(concat,"AB");
    }
}
