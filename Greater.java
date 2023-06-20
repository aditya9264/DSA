import java.util.*;

public class Greater {
    public static void greaterOfTwo(int a , int b){
       if(a>b){
    System.out.println(a+" Is Greater Than "+b);
       }
       else if(b>a){
        System.out.println(b+" Is Greater Than "+a);

       }
       else
       {
        System.out.println(a+" And "+ b +"  are Equall ");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         greaterOfTwo(a, b);
    }

}
