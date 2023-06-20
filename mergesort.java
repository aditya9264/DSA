import java.util.*;

public class mergesort {
    public static void conquer(int a[], int si, int mid, int ei) {
        int merger[] = new int[ei - si + 1];//this step states that we have made an empty array as mer ger for merging the sorted parts and the size of 
        //that is written 
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (a[idx1] <= a[idx2]) {
                merger[x] = a[idx1];
                x++;
                idx1++;
            } else {
                merger[x++] = a[idx2++];

            }
        }
        while (idx1 <= mid) {
            merger[x++] = a[idx1++];
        }
        while (idx2 <= ei) {
            merger[x++] = a[idx2++];
        }
        for (int i = 0, j = si; i < merger.length; i++, j++) {
            a[j] = merger[i];
        }
    }

    public static void divide(int a[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(a, si, mid);
        divide(a, mid + 1, ei);
        conquer(a, si, mid, ei);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        divide(a, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
