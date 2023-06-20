import java.util.*;

public class posnegzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int pos = 0;
        int neg = 0;
        int zero = 0;
        int i;
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>0){
                pos++;
            }
            else if(arr[i]<0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.println("Count of Positive Number is : "+pos );
        System.out.println("And Count of Negative Numbers are "+neg );
        System.out.println("Count of Zeros are : "+zero);
    }
}
