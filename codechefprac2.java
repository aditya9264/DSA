import java.util.*;
public class codechefprac2 {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner (System.in);
	    
        int t = sc.nextInt();
        
        while(t != 0){
            int cnt =0;
            int n =sc.nextInt();
            int type[] = new int[n];
            for(int i=0;i<n;i++){
                type[i] = sc.nextInt();
                
            }
             for(int i=0;i<n;i++){
                 if((type[i]%2) != 0){
                     cnt++;
                 }
    }
    System.out.println(cnt);
}
    }
}
