import java.util.*;

public class numberofoccerence {
    private static final String Key = null;

    public static int firstOccurence(int a[], int n, int key) {
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (a[mid] == key) {
                ans = mid;
                end = mid - 1;
            } else if (key > a[mid]) {
                start = mid + 1;
            } else if (key < a[mid]) {
                end = mid - 1;
            }
        }
        return ans;

    }

    public static int lastOccurence(int a[], int n, int key) {
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            ;
            if (a[mid] == key) {
                ans = mid;
                start = mid + 1;
            } else if (key > a[mid]) {
                start = mid + 1;
            } else if (key < a[mid]) {
                end = mid - 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        int FO = firstOccurence(a, n, key);
        int LO = lastOccurence(a, n, key);
        int TNO = (LO - FO) + 1;
        System.out.println(Key +" is present " + TNO + " times in the array");

    }
}
