import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathFuncsTest {

    @Test
    public void sumUntil(){
        // AAA
        // Arrange
        int n = 5;

        // Act - call method
        int actual = MathFuncs.sumUntil(n);

        // Assert
        Assertions.assertEquals(15, actual);

    }
    @Test
    public void sumUntil2(){
        // AAA
        // Arrange
        int n = 6;

        // Act - call method
        int actual = MathFuncs.sumUntil(n);

        // Assert
        Assertions.assertEquals(21, actual);

    }
}
