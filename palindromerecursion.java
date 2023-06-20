public class palindromerecursion {
    public static void main(String[] args) {
        System.out.println(palin(123));
    }
    
    static boolean palin(int n) {
        return n == rev1(n); 
    }

    static int rev1(int n){
        int digits = (int )(Math.log10(n)) + 1;
        return helper(n,digits);
    }private static int helper( int n , int digits) {
        // Base Condition
        if(n%10 == n){
            return n ; 
        }
        int rem = n%10 ; 
        return rem * (int)Math.pow(10 , digits-1) + helper(n/10 , digits-1) ;
    }  
  
}
