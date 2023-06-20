import java.util.*;

public class codechefprac {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int  p[] = new int[4];
     for(int i=0;i<4;i++){
         p[i]  =  sc.nextInt();
     }
     int cnt =0;
       for(int i=0;i<4;i++){
           if(p[i] >= 10)
           cnt++;
       }
      System.out.println(cnt);
      
    }
}
