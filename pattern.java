import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                System.out.println("*");
            }
        }
    }
}
