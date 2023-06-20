import java.util.*;

public class peak {
    public static int peakElement(int a[], int n) {
        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;
        while (start < end) {

            if (a[mid] < a[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = start + (end - start) / 2;
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int key = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        int peakinarray = peakElement(a, n);
        System.out.println("the peak element is : " + peakinarray);
    }
}
