import java.util.*;
public class setbit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
int newNumber = bitMask | n ;
System.out.println(newNumber);   
 }
}
