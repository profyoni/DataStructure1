import java.util.HashMap;

public class Recursion {
    public static int factorial(int n) {
        return n==0? 1 /* Base Case */ : n * factorial(n-1);
    }

    public static boolean isPalindrome(String s){
        if (s.length()<2)
            return true;
        return s.charAt(0) == s.charAt(s.length()-1) && isPalindrome(s.substring(1, s.length()-1));
    }

    public static int add(int n, int m){
        if (m == 0)
            return n;
        return add(n+1, m-1);
    }

    static private HashMap<Integer,Long> map = new HashMap<>();
    public static long fib(int n) {
        if (map.containsKey(n))
            return map.get(n);
        long ret = n<=1 ? n /* 2 Base Cases */
                : fib(n-2) + fib(n-1);
                map.put(n, ret);
                return ret;
    }
}
