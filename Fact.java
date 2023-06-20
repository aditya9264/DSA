import java.util.*;
public class Fact{
    public static void factorialOfNumber(int n){
        int fact = 1;
       for (int i=n;i>=1;i--){
         fact *= i; 
       }
       System.out.println(fact);
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        factorialOfNumber(n);

    }
}
