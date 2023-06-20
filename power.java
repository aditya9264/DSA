import java.util.*;

public class power {
    public static int powerOfNumber(int n , int x){
         int exp = (int)Math.pow(x,n);
         return exp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int exp = powerOfNumber(n, x);
        System.out.println("Power of Number is : "+exp);
    }
}
