public class fibonaccirecursion {
    static int fibbo(int n){
       //Base Condition

       if(n  < 2){
        return n;
       }
        return fibbo(n-1) + fibbo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibbo(6));
    }
}
