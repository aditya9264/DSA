import java.util.*;

public class getbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos = 3 ;
        int bitMask = 1 << pos;
        if ((bitMask & n) == 0) {
            System.out.println("bit was : 0");
        } else {
            System.out.println("bit was : 1");
        }
    }
}
