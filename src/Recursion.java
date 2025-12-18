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
    public static void main(String[] args) {
        foo();

    }
    public static void foo() {
        int[] a = new int[1_000_000];
        a[555_555] = 15;
        a[155_555] = 1;
        a[8] = 150;
        throw new RuntimeException();
        //max(a);
    }

    public static int max(int[] a) {
        return max(a, 0, a.length);

    }

    ///
    /// start - first index
    /// end - last index (exclusive)
    private static int  max(int[] a, int start, int end) {
        System.out.println(start +",\t" + end);
        if (end - start == 1) // Base
            return a[start];
        int endPoint = start + (end-start)/2;
        int max1 = max(a, start, endPoint );
        int max2 = max(a, endPoint, end);
        return max1 > max2 ? max1 : max2;
    }
}
