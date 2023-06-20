import java.util.*;

public class stringintro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(a.length() + b.length());

        //Compare The Strings 
        int comp = a.compareTo(b);

        if(comp < 0){
            System.out.println("No");
        } 
        else if(comp == 0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
       String s1 = a.substring(0, 1).toUpperCase()+a.substring(1);
       String s2 = b.substring(0,1).toUpperCase()+b.substring(1);
       //System.out.println(s1);

       //String s3 = s1+s2;

       System.out.println(s1 + " " + s2);

    }
}
