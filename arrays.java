import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int num[] = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (num[i] == x) {
                System.out.println(x + " is found at index " + i);
                break;
            }
        }
    }
}
