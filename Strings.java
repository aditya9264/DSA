import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        // Concatenation
        String s3 = s1 + s2;
        for (int i = 0; i < s3.length(); i++) {
            System.out.println(s3.charAt(i));
        }
        System.out.println("The Concatenated String is : " + s3);
        // Compare
        if (s1.compareTo(s2) == 0) {
            System.out.println("Strings are equall");
        } else {
            System.out.println("Strings are not equall");
        }

        String s4 = s3.substring(6, s3.length());
        System.out.println(s4);
    }
}
