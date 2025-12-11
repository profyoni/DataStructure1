import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    void recursion() {
        assertEquals(720, Recursion.factorial(6));
    }

@Test
void palindrome() {
    assertTrue(Recursion.isPalindrome("racecar"));
    assertTrue(Recursion.isPalindrome("mom"));
    assertTrue(Recursion.isPalindrome("radar"));
    assertTrue(Recursion.isPalindrome("asdffdsa"));

    assertTrue(Recursion.isPalindrome("A"));
    assertTrue(Recursion.isPalindrome(""));


    assertTrue(! Recursion.isPalindrome("racaecar"));
}

    @Test
    void add() {
        assertEquals(9, Recursion.add(5,4));
        assertEquals(99999999, Recursion.add(55555555,44444444));
    }
}