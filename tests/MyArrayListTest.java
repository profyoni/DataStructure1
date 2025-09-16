import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
