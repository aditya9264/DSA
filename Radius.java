import java.util.*;
public class Radius {
    public static double circumOfCircle(int r) {
        double circum = (2*3.14)*r;
        return circum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int r = sc.nextInt();
      double circum = circumOfCircle(r);
        System.out.println(circum);
    }
}
