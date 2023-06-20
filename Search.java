import java.util.*;

public class Search {
    public static int binarySearch(int a[], int n, int key) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            ;
            if (a[mid] == key) {
                return mid;
            } else if (key > a[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        int index = binarySearch(a, n, key);
        System.out.println("the index of " +key+" is: " +index);

    }
}
