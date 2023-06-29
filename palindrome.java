import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int temp = num;
     while( num != 0){
       int digit = num%10;
       num= num/10;
       rev  = (rev*10)+digit;
       
       
     }
System.out.println(rev);
     if(temp == rev){
        System.out.println("Palindrome");
     }
     else{
        System.out.println("Not a Palindrome");
     }
    }
}
