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


    @Test
    void fib() {
        assertEquals(5, Recursion.fib(5));
        assertEquals(55, Recursion.fib(10));
        assertEquals(1548008755920L, Recursion.fib(60));
    }
    @Test
    void max(){
        int[] a = new int[1_000_000];
        a[555_555] = 15;
        a[155_555] = 1;
        a[8] = 150;

        assertEquals(150, Recursion.max(a));
    }
}
