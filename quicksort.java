import java.util.*;

public class quicksort {
    public static int  partition(int a[], int low, int high) {
        int pivot = a[high];
        int i =low-1;
        for(int j=low;j<high;j++){
            if(a[j]<pivot){
                i++;
                //swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        int temp = a[i];
        a[i] = pivot;
        a[high] = temp;
        // i is the pivot index 
        return i;
    }

    public static void quickSort(int a[], int low, int high){
        if(low < high){
             int piidx = partition(a , low , high);

             quickSort(a, low, piidx-1);
             quickSort(a, piidx+1, high);
        }
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
            quickSort(a, 0, n-1);
            //print 
            for(int i=0;i<n;i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
    }
}
