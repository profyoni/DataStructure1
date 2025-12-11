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
}
