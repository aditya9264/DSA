import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            
            for (int i=n;i>=1;--i){
                
                 for(int space = 1 ; space <= n-i ; ++space){
                    System.out.print(" ");
                 }
                
                 for(int j=i ; j <= (2*i)-1 ; ++j){
                    System.out.print(i+ " " );
                 }
                 
                 System.out.println();
                
            
                }
    }
}
