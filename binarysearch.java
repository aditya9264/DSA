import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int s=0;
        int e = n-1;
        
        while(s <= e){
            int mid = s+((e-s)/2);
         
             if(a[mid] > key){
                e = mid - 1;
            }
              else if(a[mid] == key ){
                System.out.println("Element is found at - "+mid);
                break;
            }
            else{
                s = mid+1;
            }
        }
        if(s>e){
            System.out.println("Element is not Found ");
        }

    }
}
