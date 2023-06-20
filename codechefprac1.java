import java.util.*;
public class codechefprac1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
	    
        int t = sc.nextInt();
        
        while(t != 0){
            int cnt =0;
            int n =sc.nextInt();
            int d[] = new int[n];
            for(int i=0;i<n;i++){
                d[i] = sc.nextInt();
                
            }
             for(int i=0;i<n;i++){
                 if(d[i] >= 1000){
                     cnt++;
                 }
             
            
        }
        System.out.println(cnt);
        
 }
    }
}
